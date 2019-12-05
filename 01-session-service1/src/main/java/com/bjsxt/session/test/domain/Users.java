package com.bjsxt.session.test.domain;

import java.io.Serializable;

public class Users implements Serializable {
    private String username;
    private String userpwd;
    private Roles roles;

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

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
