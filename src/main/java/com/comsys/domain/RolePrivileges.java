package com.comsys.domain;

import java.io.Serializable;

public class RolePrivileges implements Serializable{
	private static final long serialVersionUID = -1452625000946015844L;

	private Integer roleId;

    private Integer priId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPriId() {
        return priId;
    }

    public void setPriId(Integer priId) {
        this.priId = priId;
    }
}