package com.yfkj.datacenter.biz.service;

import com.yfkj.datacenter.api.exception.ArgumentException;
import com.yfkj.datacenter.api.exception.ExceptionCode;
import com.yfkj.datacenter.api.exception.RepositoryException;
import com.yfkj.datacenter.api.model.param.VideoTransferDTO;
import com.yfkj.datacenter.api.model.result.VideoTransferResult;
import com.yfkj.datacenter.api.service.VideoTransferService;
import com.yfkj.datacenter.biz.manager.VideoTransferManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Jerry Tan
 * @date 2017\12\20 0020 11:33
 */
public class VideoTransferServiceImpl implements VideoTransferService {

    @Autowired
    private VideoTransferManager videoTransferManager;
    private static Logger Log =LoggerFactory.getLogger(VideoTransferServiceImpl.class);

    @Override
    public VideoTransferResult<VideoTransferDTO> findByApp(String appName) {
        VideoTransferResult<VideoTransferDTO> result = new VideoTransferResult<VideoTransferDTO>();
        try {
            if (appName == null) {
                throw new ArgumentException(ExceptionCode.PARAM_ERROR.getErrorCode(), "appName is null");
            }
            VideoTransferDTO videoTransferDTO = videoTransferManager.findByApp(appName);
            result.setSuccess(true);
            result.setValue(videoTransferDTO);
            return result;

        } catch (ArgumentException ae) {
            String errorMsg = String.format("update failure:params:" + appName);
            Log.error(errorMsg, ae);
            result.setErrorCode(ae.getErrorCode());
            result.setErrorMsg(ae.getMessage());
            return result;
        } catch (RepositoryException re) {
            String errorMsg = String.format("update failure:params:" + appName);
            Log.error(errorMsg, re);
            result.setErrorCode(re.getErrorCode());
            result.setErrorMsg(re.getMessage());
        } catch (Throwable th) {
            String errorMsg = String.format("update failure:params:" + appName);
            Log.error(errorMsg, th);
            result.setErrorCode(result.getErrorCode());
            result.setErrorMsg(result.getErrorMsg());
            return result;
        }
    return result;
    }

}
