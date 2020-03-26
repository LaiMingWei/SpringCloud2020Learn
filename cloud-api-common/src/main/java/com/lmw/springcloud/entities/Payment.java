package com.lmw.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Payment
 * @Description: 支付类
 * @Author MingWei
 * @Date 2020/3/26 0:41
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
	private Long id;
	private String serial;
}
