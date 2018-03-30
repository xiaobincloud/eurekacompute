package com.ulinkcare;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xiaobin
 *         成都友漾健康科技有限公司
 *         Created by xiaobin on 2017/6/7
 *         Copyright (c) 2016-2019
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ComputeServiceApplication.class).web(true).run(args);
    }

}
