package com.cody.controller;

import com.cody.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 应用模块名称<p>
 * <p>
 * 通过@FeignClient定义的接口来统一的生命我们需要依赖的微服务接口
 * 而在具体使用的时候就跟调用本地方法一点的进行调用即可
 * 由于Feign是基于Ribbon实现的，所以它自带了客户端负载均衡功能，也可以通过Ribbon的IRule进行策略扩展
 * 另外，Feign还整合的Hystrix来实现服务的容错保护，在Dalston版本中，Feign的Hystrix默认是关闭的
 * 配置文件中配置 eureka.feign.hystrix.enabled=true 可开启Hystrix
 * <p>
 * Copyright: Copyright (C) 2019 XXX, Inc. All rights reserved. <p>
 *
 * @author WQL
 * @since 2019年11月25日 0025 17:38
 */
@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    /**
     * 通过@FeignClient消费定义的dc接口
     *
     * @return
     */
    @GetMapping("consumer")
    public String dc() {
        return dcClient.consumer();
    }

}
