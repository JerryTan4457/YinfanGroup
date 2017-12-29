package com.yfkj.datacenter.biz.manager;

import com.yfkj.datacenter.api.model.param.VideoTransferDTO;
import com.yfkj.datacenter.biz.domain.VideoTransferDO;
import com.yfkj.datacenter.biz.manager.helper.VideoTransferHelper;
import com.yfkj.datacenter.biz.repository.VideoTransferRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Jerry Tan
 * @date 2017\12\20 0020 11:25
 */
public class VideoTransferManager {
    @Autowired
    private VideoTransferRepository videoTransferRepository;
    @Autowired
    private VideoTransferHelper videoTransferHelper;

    public VideoTransferDTO findByApp(String appName){
        VideoTransferDO videoTransferDO =videoTransferRepository.findByApp(appName);
        VideoTransferDTO videoTransferDTO = videoTransferHelper.convertToDTO(videoTransferDO);
        return videoTransferDTO;
    }
}
