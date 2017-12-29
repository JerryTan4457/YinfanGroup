package com.yfkj.datacenter.biz.config;

import com.yfkj.datacenter.api.service.VideoTransferService;
import com.yfkj.datacenter.biz.service.VideoTransferServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jerry Tan
 * @date 2017\12\27 0027 14:42
 */
@Configuration
public class ApplicationServiceConfig {
    @Bean
    public VideoTransferService videoTransferService(){
        return new VideoTransferServiceImpl();
}
}
