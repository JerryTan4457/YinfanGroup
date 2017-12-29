package com.yfkj.datacenter.biz.repository;


import com.yfkj.datacenter.api.exception.ExceptionCode;
import com.yfkj.datacenter.api.exception.RepositoryException;
import com.yfkj.datacenter.api.query.VideoTransferQuery;
import com.yfkj.datacenter.biz.dao.VideoTransferMapper;
import com.yfkj.datacenter.biz.domain.VideoTransferDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jerry Tan
 * @date 2017\12\20 0020 11:30
 */
public class VideoTransferRepository {
    @Autowired
    private VideoTransferMapper videoTransferMapper;

//    public List<VideoTransferDO> findByApp(AppTransferQuery query) {
//        try {
//            Map<String, Object> params = new HashMap<String, Object>();
//        } catch (Throwable th) {
//            throw new RepositoryException(ExceptionCode.DB_ERROR.getErrorCode(), ExceptionCode.DB_ERROR.getErrorMsg());
//        }
//        return null;
//    }

    public VideoTransferDO findByApp(String appName) {
        try{
            Map<String,Object> params = new HashMap<String, Object>();
            params.put("appName",appName);
            return videoTransferMapper.findByApp(params);
        }catch (Throwable th){
            throw new RepositoryException(ExceptionCode.DB_ERROR.getErrorCode(),ExceptionCode.DB_ERROR.getErrorMsg());
        }
    }
    public int count(VideoTransferQuery videoTransferQuery){
        try{
            Map<String,Object> params = new HashMap<String, Object>();
            params.put("appName","田力-海豚TV");
            if (!StringUtils.isEmpty(videoTransferQuery.getClass())){
                params.put("appName",videoTransferQuery.getClass());
            }
            return videoTransferMapper.countByApp(params);
        }catch (Throwable th){
            throw new RepositoryException(ExceptionCode.DB_ERROR.getErrorCode(),ExceptionCode.DB_ERROR.getErrorMsg(),th);
        }
    }

}
