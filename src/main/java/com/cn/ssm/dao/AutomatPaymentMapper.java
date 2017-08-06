package com.cn.ssm.dao;

import com.cn.ssm.pojo.AutomatPayment;
import com.cn.ssm.pojo.AutomatPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutomatPaymentMapper {
    int countByExample(AutomatPaymentExample example);

    int deleteByExample(AutomatPaymentExample example);

    int deleteByPrimaryKey(String autorecId);

    int insert(AutomatPayment record);

    int insertSelective(AutomatPayment record);

    List<AutomatPayment> selectByExample(AutomatPaymentExample example);

    AutomatPayment selectByPrimaryKey(String autorecId);

    int updateByExampleSelective(@Param("record") AutomatPayment record, @Param("example") AutomatPaymentExample example);

    int updateByExample(@Param("record") AutomatPayment record, @Param("example") AutomatPaymentExample example);

    int updateByPrimaryKeySelective(AutomatPayment record);

    int updateByPrimaryKey(AutomatPayment record);
}