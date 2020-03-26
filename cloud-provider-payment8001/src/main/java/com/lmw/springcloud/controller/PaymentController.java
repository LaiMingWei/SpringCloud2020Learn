package com.lmw.springcloud.controller;

import com.lmw.springcloud.entities.CommonResult;
import com.lmw.springcloud.entities.Payment;
import com.lmw.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName PaymentController
 * @Description: 支付控制器
 * @Author MingWei
 * @Date 2020/3/26 17:30
 * @Version V1.0
 **/
@RestController
@Slf4j
public class PaymentController {
	private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);
	@Resource
	private PaymentService paymentService;


	@PostMapping(value = "/payment/create")
	public CommonResult create(@RequestBody Payment payment){
		int result = paymentService.create(payment);
		logger.info("*****插入结果："+result);
		if(result>0){
			return new CommonResult(200,"插入数据成功",result);
		}else{
			return new CommonResult(444,"插入数据失败",null);
		}
	}


	@GetMapping(value = "/payment/get/{id}")
	public CommonResult getPaymentById(@PathVariable("id") Long id){
		Payment payment = paymentService.getPaymentById(id);
		logger.info("*****查询结果："+payment);
		if(payment!=null){
			return new CommonResult(200,"查询数据成功",payment);
		}else{
			return new CommonResult(444,"没有对应记录，查询ID"+id,null);
		}
	}
}
