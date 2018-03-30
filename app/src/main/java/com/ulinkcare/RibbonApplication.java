package com.ulinkcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiaobin
 *         成都友漾健康科技有限公司
 *         Created by xiaobin on 2017/6/7
 *         Copyright (c) 2016-2019
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }
}
