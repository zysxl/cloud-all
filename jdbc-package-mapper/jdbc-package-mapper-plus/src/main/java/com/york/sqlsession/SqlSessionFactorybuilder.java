package com.york.sqlsession;

import com.sun.org.apache.xerces.internal.xni.parser.XMLConfigurationException;
import com.york.config.XMLConfigBuilder;
import com.york.pojo.Configuration;
import org.dom4j.DocumentException;

import java.beans.PropertyVetoException;
import java.io.InputStream;

/**
 * @author by: zhouyang
 * @name: SqlSessionFactorybuilder
 * @Description: TODO
 * @Date: 2021/10/11 10:00 下午
 */
public class SqlSessionFactorybuilder {


    public SqlSessionFactory builder(InputStream in) throws DocumentException, PropertyVetoException {

        //使用dom4j解析配置文件，将解析出来的配置文件封装到configruation；
        XMLConfigBuilder xmlConfiguration = new XMLConfigBuilder();
        Configuration configuration = xmlConfiguration.parseConfig(in);
        //创建sqlsessionfactory对象 生产sqlsession
        DefalutSqlSessionFactory defalutSqlSessionFactory = new DefalutSqlSessionFactory(configuration);
        return defalutSqlSessionFactory;
    }


}
