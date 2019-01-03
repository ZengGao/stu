package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class RunConsumerFeign {
	
	public static void main(String[] args) {
		SpringApplication.run(RunConsumerFeign.class , args);
	}
}
