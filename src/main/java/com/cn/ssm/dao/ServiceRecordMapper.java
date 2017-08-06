package com.cn.ssm.dao;

import com.cn.ssm.pojo.ServiceRecord;
import com.cn.ssm.pojo.ServiceRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceRecordMapper {
    int countByExample(ServiceRecordExample example);

    int deleteByExample(ServiceRecordExample example);

    int deleteByPrimaryKey(String serviceId);

    int insert(ServiceRecord record);

    int insertSelective(ServiceRecord record);

    List<ServiceRecord> selectByExample(ServiceRecordExample example);

    ServiceRecord selectByPrimaryKey(String serviceId);

    int updateByExampleSelective(@Param("record") ServiceRecord record, @Param("example") ServiceRecordExample example);

    int updateByExample(@Param("record") ServiceRecord record, @Param("example") ServiceRecordExample example);

    int updateByPrimaryKeySelective(ServiceRecord record);

    int updateByPrimaryKey(ServiceRecord record);
}