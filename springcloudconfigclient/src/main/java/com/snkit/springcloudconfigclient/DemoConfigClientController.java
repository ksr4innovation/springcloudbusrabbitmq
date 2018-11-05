package com.snkit.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class DemoConfigClientController {

	
	
	@Value("${name: config server properties is not set for name}")
	private String name;
	
	@Value("${url: config server properties is not set for url}")
	private String url;
	
	
	@GetMapping(value="/getConfigDetails")
	public ConfigCustomVO  getConfigDetails() {
		
		return new ConfigCustomVO(this.name,this.url);
	}
	
	
}
