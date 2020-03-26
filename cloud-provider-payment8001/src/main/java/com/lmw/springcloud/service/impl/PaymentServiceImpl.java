package com.lmw.springcloud.service.impl;

import com.lmw.springcloud.dao.PaymentDao;
import com.lmw.springcloud.entities.Payment;
import com.lmw.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description: 支付接口实现类
 * @Author MingWei
 * @Date 2020/3/26 14:46
 * @Version V1.0
 **/
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {
	@Resource
	private PaymentDao paymentDao;

	@Override
	public int create(Payment payment) {
		return paymentDao.create(payment);
	}

	@Override
	public Payment getPaymentById(Long id) {
		return paymentDao.getPaymentById(id);
	}
}
