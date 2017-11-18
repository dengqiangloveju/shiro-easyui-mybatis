package com.comsys.mapper;

import com.comsys.domain.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(UserRole key);

    int insert(UserRole record);

    int insertSelective(UserRole record);
}