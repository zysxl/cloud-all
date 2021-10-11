package com.york.pojo;

/**
 * @author by: zhouyang
 * @name: MapperStatement
 * @Description: TODO
 * @Date: 2021/10/11 9:39 下午
 */
public class MapperStatement {

    /**
     * 唯一标识ID
     */
    private String id;
    /**
     * 返回值
     */
    private String resultType;
    /**
     * 请求参数
     */
    private String paramterType;
    /**
     * sql语句
     */
    private String sql;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getParamterType() {
        return paramterType;
    }

    public void setParamterType(String paramterType) {
        this.paramterType = paramterType;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
