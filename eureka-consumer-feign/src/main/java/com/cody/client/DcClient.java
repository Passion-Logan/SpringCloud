package com.cody.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2019 XXX, Inc. All rights reserved. <p>
 *
 * @author WQL
 * @since 2019年11月25日 0025 17:40
 */
@FeignClient("eureka-client")
public interface DcClient {

    /**
     * 消费dc接口
     *
     * @return
     */
    @GetMapping("dc")
    String consumer();
}
