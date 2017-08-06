package com.cn.ssm.dao;

import com.cn.ssm.pojo.Tel;
import com.cn.ssm.pojo.TelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TelMapper {
    int countByExample(TelExample example);

    int deleteByExample(TelExample example);

    int deleteByPrimaryKey(String telId);

    int insert(Tel record);

    int insertSelective(Tel record);

    List<Tel> selectByExample(TelExample example);

    Tel selectByPrimaryKey(String telId);

    int updateByExampleSelective(@Param("record") Tel record, @Param("example") TelExample example);

    int updateByExample(@Param("record") Tel record, @Param("example") TelExample example);

    int updateByPrimaryKeySelective(Tel record);

    int updateByPrimaryKey(Tel record);
}