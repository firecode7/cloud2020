package com.cn.springcloud.alibaba.dao;

import com.cn.springcloud.alibaba.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Dark
 * @date 2020-06-29 10:53
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") long id);


}
