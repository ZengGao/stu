package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.tedu.interfice.EurekaServiceFeign;

@RestController
public class FeignController {
	@Autowired
	private EurekaServiceFeign eurekaServiceFeign;
	String aa;
	@RequestMapping("/hello/{name}")
	@HystrixCommand(fallbackMethod="hellofllback")
	public String HelloConsumer(@PathVariable String name) {
		String hello = eurekaServiceFeign.hello(name);
		return "consumer"+hello;
	}
	
	public String hellofllback(String name) {
		return "999";
	}
}
