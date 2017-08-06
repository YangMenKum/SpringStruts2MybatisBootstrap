package com.cn.ssm.dao;

import com.cn.ssm.pojo.DataFlow;
import com.cn.ssm.pojo.DataFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataFlowMapper {
    int countByExample(DataFlowExample example);

    int deleteByExample(DataFlowExample example);

    int deleteByPrimaryKey(String dfId);

    int insert(DataFlow record);

    int insertSelective(DataFlow record);

    List<DataFlow> selectByExample(DataFlowExample example);

    DataFlow selectByPrimaryKey(String dfId);

    int updateByExampleSelective(@Param("record") DataFlow record, @Param("example") DataFlowExample example);

    int updateByExample(@Param("record") DataFlow record, @Param("example") DataFlowExample example);

    int updateByPrimaryKeySelective(DataFlow record);

    int updateByPrimaryKey(DataFlow record);
}