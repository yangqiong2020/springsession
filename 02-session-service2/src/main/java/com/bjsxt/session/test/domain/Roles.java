package com.bjsxt.session.test.domain;

import java.io.Serializable;

public class Roles implements Serializable {
    private Integer roleid;
    private String rolename;

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public String getRolename() {
        return rolename;
    }
}
