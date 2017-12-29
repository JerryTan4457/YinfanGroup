package com.yfkj.datacenter.api.service;


import com.yfkj.datacenter.api.model.param.VideoTransferDTO;
import com.yfkj.datacenter.api.model.result.VideoTransferResult;

/**
 * @author Jerry Tan
 * @date 2017\12\21 0021 17:19
 */
public interface VideoTransferService {
     VideoTransferResult<VideoTransferDTO> findByApp(String appName);
}
