package com.yfkj.datacenter.biz.config;


import com.yfkj.datacenter.biz.manager.helper.VideoTransferHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jerry Tan
 * @date 2017\12\27 0027 14:41
 */
@Configuration
public class ApplicationHelperConfig {
    @Bean
    public VideoTransferHelper videoTransferHelper(){
        return new VideoTransferHelper();
    }
}
