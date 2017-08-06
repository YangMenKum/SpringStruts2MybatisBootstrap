package com.cn.ssm.dao;

import com.cn.ssm.pojo.PackageABC;
import com.cn.ssm.pojo.PackageABCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PackageABCMapper {
    int countByExample(PackageABCExample example);

    int deleteByExample(PackageABCExample example);

    int deleteByPrimaryKey(String tcId);

    int insert(PackageABC record);

    int insertSelective(PackageABC record);

    List<PackageABC> selectByExample(PackageABCExample example);

    PackageABC selectByPrimaryKey(String tcId);

    int updateByExampleSelective(@Param("record") PackageABC record, @Param("example") PackageABCExample example);

    int updateByExample(@Param("record") PackageABC record, @Param("example") PackageABCExample example);

    int updateByPrimaryKeySelective(PackageABC record);

    int updateByPrimaryKey(PackageABC record);
}