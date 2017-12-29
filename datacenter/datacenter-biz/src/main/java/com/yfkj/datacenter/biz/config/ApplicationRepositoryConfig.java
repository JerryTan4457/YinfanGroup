package com.yfkj.datacenter.biz.config;


import com.yfkj.datacenter.biz.repository.VideoTransferRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jerry Tan
 * @date 2017\12\27 0027 15:35
 */
@Configuration
public class ApplicationRepositoryConfig {
    @Bean
    public VideoTransferRepository videoTransferRepository(){
        return new VideoTransferRepository();
    }
}
