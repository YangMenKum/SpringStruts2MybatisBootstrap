package com.cn.ssm.dao;

import com.cn.ssm.pojo.CallLog;
import com.cn.ssm.pojo.CallLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CallLogMapper {
    int countByExample(CallLogExample example);

    int deleteByExample(CallLogExample example);

    int deleteByPrimaryKey(String calllogId);

    int insert(CallLog record);

    int insertSelective(CallLog record);

    List<CallLog> selectByExample(CallLogExample example);

    CallLog selectByPrimaryKey(String calllogId);

    int updateByExampleSelective(@Param("record") CallLog record, @Param("example") CallLogExample example);

    int updateByExample(@Param("record") CallLog record, @Param("example") CallLogExample example);

    int updateByPrimaryKeySelective(CallLog record);

    int updateByPrimaryKey(CallLog record);
}