package com.yfkj.datacenter.biz.config;


import com.yfkj.datacenter.biz.manager.VideoTransferManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jerry Tan
 * @date 2017\12\27 0027 14:41
 */
@Configuration
public class ApplicationManagerConfig {
    @Bean
    public VideoTransferManager videoTransferManager(){
        return new VideoTransferManager();
    }
}
