package com.york.sqlsession;

import com.york.pojo.Configuration;

/**
 * @author by: zhouyang
 * @name: DefalutSqlSessionFactory
 * @Description: TODO
 * @Date: 2021/10/11 11:21 下午
 */
public class DefalutSqlSessionFactory implements SqlSessionFactory {

    private Configuration configuration;


    public DefalutSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {

        return new DefaultSqlSession();
    }
}
