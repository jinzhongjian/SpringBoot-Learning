package com.rodney.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlogProperties {
    @Value("${com.rodney.blog.name}")
    private String name;
    @Value("${com.rodney.blog.title}")
    private String title;
    @Value("${com.rodney.blog.desc}")
    private String desc;

    @Value("${com.rodney.blog.value}")
    private String value;
    @Value("${com.rodney.blog.number}")
    private Integer number;
    @Value("${com.rodney.blog.bignumber}")
    private Long bignumber;
    @Value("${com.rodney.blog.test1}")
    private Integer test1;
    @Value("${com.rodney.blog.test2}")
    private Integer test2;
    @Value("${com.rodney.blog.uuid}")
    private String uuid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBignumber() {
        return bignumber;
    }

    public void setBignumber(Long bignumber) {
        this.bignumber = bignumber;
    }

    public Integer getTest1() {
        return test1;
    }

    public void setTest1(Integer test1) {
        this.test1 = test1;
    }

    public Integer getTest2() {
        return test2;
    }

    public void setTest2(Integer test2) {
        this.test2 = test2;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
