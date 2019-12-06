package com.bjsxt.mongo.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
public class Users implements Serializable {
    private String username;
    private String userpwd;

    public String getUsername() {
        return username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }
}
