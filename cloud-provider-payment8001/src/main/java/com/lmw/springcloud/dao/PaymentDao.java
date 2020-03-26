package com.lmw.springcloud.dao;

import com.lmw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @InterfaceName PaymentDao
 * @Description: 支付接口
 * @Author MingWei
 * @Date 2020/3/26 14:38
 * @Version V1.0
 **/
@Mapper
public interface PaymentDao {
	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);
}
