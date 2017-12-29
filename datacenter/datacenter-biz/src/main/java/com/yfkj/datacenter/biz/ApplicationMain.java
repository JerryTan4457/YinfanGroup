package com.yfkj.datacenter.biz;


import com.yfkj.datacenter.api.model.param.VideoTransferDTO;
import com.yfkj.datacenter.api.model.result.VideoTransferResult;
import com.yfkj.datacenter.api.service.VideoTransferService;
import com.yfkj.datacenter.biz.config.ApplicationHelperConfig;
import com.yfkj.datacenter.biz.config.ApplicationManagerConfig;
import com.yfkj.datacenter.biz.config.ApplicationRepositoryConfig;
import com.yfkj.datacenter.biz.config.ApplicationServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Jerry Tan
 * @date 2017\12\28 0028 12:04
 */
@SpringBootApplication
@ImportResource("classpath:application-boot.xml")
@Import({ApplicationHelperConfig.class, ApplicationRepositoryConfig.class, ApplicationManagerConfig.class,
        ApplicationServiceConfig.class})
public class ApplicationMain {
    public static void main(String[] args) throws InterruptedException{
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ApplicationMain.class,args);
        VideoTransferService videoTransferService = (VideoTransferService) applicationContext.getBean("videoTransferService");
        VideoTransferResult<VideoTransferDTO> result = videoTransferService.findByApp("影");
        System.out.println();
    }
}
