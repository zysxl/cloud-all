package com.york.config;

import com.york.pojo.Configuration;
import com.york.pojo.MapperStatement;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @author by: zhouyang
 * @name: XMLConfigMapperBuilder
 * @Description: TODO
 * @Date: 2021/10/11 10:52 下午
 */
public class XMLConfigMapperBuilder {

    private Configuration configuration;

    public XMLConfigMapperBuilder(Configuration configuration) {
        this.configuration = configuration;
    }

    public void parse(InputStream in) throws DocumentException {
        Document document = new SAXReader().read(in);
        Element rootElement = document.getRootElement();
        String namespace = rootElement.attributeValue("namespace");
        List<Element> list = rootElement.selectNodes("//select");
        for (Element element : list) {
            String id = element.attributeValue("id");
            String resultType = element.attributeValue("resultType");
            String parameterType = element.attributeValue("parameterType");
            String sqlText = element.getTextTrim();

            MapperStatement mapperStatement = new MapperStatement();
            mapperStatement.setId(id);
            mapperStatement.setResultType(resultType);
            mapperStatement.setParamterType(parameterType);
            mapperStatement.setSql(sqlText);
            String key = namespace +"." + id ;
            configuration.getMap().put(key,mapperStatement);
        }
    }
}
