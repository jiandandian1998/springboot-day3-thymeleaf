package com.offcn.po;

public class User {
    private Long id;
    private String name;
    private  Integer ahe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAhe() {
        return ahe;
    }

    public void setAhe(Integer ahe) {
        this.ahe = ahe;
    }

    public User() {
        super();
    }

    public User(Long id, String name, Integer ahe) {
        super();
        this.id = id;
        this.name = name;
        this.ahe = ahe;
    }
}
