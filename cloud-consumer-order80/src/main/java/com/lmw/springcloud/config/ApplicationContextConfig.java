package com.lmw.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * @Description: httpClient配置类
 * @Author MingWei
 * @Date 2020/3/26 21:18
 * @Version V1.0
 **/
@Configuration
public class ApplicationContextConfig {
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
