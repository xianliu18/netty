package com.noodles.demo.like.mybatis;

import java.sql.Connection;
import java.util.Map;

/**
 * @Description:
 * @Author: noodles
 * @create: 2021-01-24 22:25
 */
public class Configuration {

    protected Connection connection;
    protected Map<String, String> dataSource;
    protected Map<String, XNode> mapperElement;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setDataSource(Map<String, String> dataSource) {
        this.dataSource = dataSource;
    }

    public void setMapperElement(Map<String, XNode> mapperElement) {
        this.mapperElement = mapperElement;
    }
}
