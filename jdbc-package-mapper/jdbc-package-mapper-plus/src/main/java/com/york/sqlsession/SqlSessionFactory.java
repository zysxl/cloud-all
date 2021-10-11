package com.york.sqlsession;

/**
 * @author by: zhouyang
 * @name: SqlSessionFactory
 * @Description: TODO
 * @Date: 2021/10/11 10:02 下午
 */
public interface SqlSessionFactory {

    public SqlSession openSession();

}
