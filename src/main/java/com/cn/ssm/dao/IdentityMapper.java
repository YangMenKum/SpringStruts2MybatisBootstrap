package com.cn.ssm.dao;

import com.cn.ssm.pojo.Identity;
import com.cn.ssm.pojo.IdentityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdentityMapper {
    int countByExample(IdentityExample example);

    int deleteByExample(IdentityExample example);

    int deleteByPrimaryKey(String tmId);

    int insert(Identity record);

    int insertSelective(Identity record);

    List<Identity> selectByExample(IdentityExample example);

    Identity selectByPrimaryKey(String tmId);

    int updateByExampleSelective(@Param("record") Identity record, @Param("example") IdentityExample example);

    int updateByExample(@Param("record") Identity record, @Param("example") IdentityExample example);

    int updateByPrimaryKeySelective(Identity record);

    int updateByPrimaryKey(Identity record);
}