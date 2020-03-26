package com.lmw.springcloud.service;

import com.lmw.springcloud.entities.Payment;

/**
 * @InterfaceName PaymentService
 * @Description: 支付服务接口
 * @Author MingWei
 * @Date 2020/3/26 14:46
 * @Version V1.0
 **/
public interface PaymentService {

	public int create(Payment payment);

	public Payment getPaymentById(Long id);
}
