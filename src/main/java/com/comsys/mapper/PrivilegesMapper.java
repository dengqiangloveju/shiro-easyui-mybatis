package com.comsys.mapper;

import com.comsys.domain.Privileges;

public interface PrivilegesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Privileges record);

    int insertSelective(Privileges record);

    Privileges selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Privileges record);

    int updateByPrimaryKey(Privileges record);
}