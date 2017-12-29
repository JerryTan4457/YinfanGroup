package com.yfkj.datacenter.biz.dao;


import com.yfkj.datacenter.biz.domain.VideoTransferDO;

import java.util.List;
import java.util.Map;

/**
 * @author Jerry Tan
 * @date 2017\12\20 0020 11:29
 */
public interface VideoTransferMapper {
    //查询，计数
//    VideoTransferDO find(Map<String,Object> params);
    /**按应用查找**/
    VideoTransferDO findByApp(Map<String, Object> params);

    int countByApp(Map<String, Object> params);
    /**按应用计数**/
}
