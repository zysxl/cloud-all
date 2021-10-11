package com.york.pojo;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author by: zhouyang
 * @name: Configuration
 * @Description: TODO
 * @Date: 2021/10/11 9:42 下午
 */
public class Configuration {

    private DataSource dataSource;
    /**
     * key :string  statementID
     */
    Map<String,MapperStatement> map = new HashMap<>();

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Map<String, MapperStatement> getMap() {
        return map;
    }

    public void setMap(Map<String, MapperStatement> map) {
        this.map = map;
    }
}
