package com.czh.www.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author keivn
 * @since 2018-09-11
 */
public class OrderProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
        ", id=" + id +
        ", name=" + name +
        "}";
    }
}
