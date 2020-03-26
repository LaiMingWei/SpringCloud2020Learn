package com.lmw.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonResult
 * @Description: 返回前端的消息类
 * @Author MingWei
 * @Date 2020/3/26 14:31
 * @Version V1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
	private Integer code;
	private String message;
	private T data;

	public CommonResult(Integer code, String message) {
		this(code, message, null);
	}
}
