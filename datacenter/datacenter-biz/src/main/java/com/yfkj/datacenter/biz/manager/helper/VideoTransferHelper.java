package com.yfkj.datacenter.biz.manager.helper;

import com.yfkj.datacenter.api.model.param.VideoTransferDTO;
import com.yfkj.datacenter.biz.domain.VideoTransferDO;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jerry Tan
 * @date 2017\12\20 0020 11:27
 */
public class VideoTransferHelper extends ModelHelper<VideoTransferDO,VideoTransferDTO> {
    @Override
    public List<VideoTransferDTO> convertToDTO(List<VideoTransferDO> modelDOs) {
        DecimalFormat df = new DecimalFormat("0.00");
        List<VideoTransferDTO> dtoList = new ArrayList<VideoTransferDTO>();
        for (VideoTransferDO modelDO : modelDOs) {
            dtoList.add(convertToDTO(modelDO));
        }
        return dtoList;
    }
}