package com.cn.ssm.dao;

import com.cn.ssm.pojo.PayRecord;
import com.cn.ssm.pojo.PayRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayRecordMapper {
    int countByExample(PayRecordExample example);

    int deleteByExample(PayRecordExample example);

    int deleteByPrimaryKey(String payrecId);

    int insert(PayRecord record);

    int insertSelective(PayRecord record);

    List<PayRecord> selectByExample(PayRecordExample example);

    PayRecord selectByPrimaryKey(String payrecId);

    int updateByExampleSelective(@Param("record") PayRecord record, @Param("example") PayRecordExample example);

    int updateByExample(@Param("record") PayRecord record, @Param("example") PayRecordExample example);

    int updateByPrimaryKeySelective(PayRecord record);

    int updateByPrimaryKey(PayRecord record);
}