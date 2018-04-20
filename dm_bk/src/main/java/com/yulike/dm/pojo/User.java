package com.yulike.dm.pojo;

import java.io.Serializable;

public class User implements Serializable{

    private static final long serialVersionUID = 1418658161563456559L;
    private Long id;
    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
