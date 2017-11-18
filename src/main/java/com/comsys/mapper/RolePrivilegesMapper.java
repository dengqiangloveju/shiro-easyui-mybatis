package com.comsys.mapper;

import com.comsys.domain.RolePrivileges;

public interface RolePrivilegesMapper {
    int deleteByPrimaryKey(RolePrivileges key);

    int insert(RolePrivileges record);

    int insertSelective(RolePrivileges record);
}