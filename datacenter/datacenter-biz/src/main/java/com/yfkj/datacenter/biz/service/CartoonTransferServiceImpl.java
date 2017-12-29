//package com.yfkj.datacenter.biz.service;
//
//import com.yfkj.datacenter.api.exception.ArgumentException;
//import com.yfkj.datacenter.api.exception.ExceptionCode;
//import com.yfkj.datacenter.api.exception.RepositoryException;
//import com.yfkj.datacenter.api.model.param.CartoonTransferDTO;
//import com.yfkj.datacenter.api.model.result.CartoonTransferResult;
//import com.yfkj.datacenter.biz.manager.CartoonTransferManager;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// * @author Jerry Tan
// * @date 2017\12\28 0028 15:44
// */
//public class CartoonTransferServiceImpl {
//    @Autowired
//    private CartoonTransferManager cartoonTransferManager;
//    private static Logger Log = LoggerFactory.getLogger(CartoonTransferServiceImpl.class);
//
//    @Override
//    public CartoonTransferResult<CartoonTransferDTO> findByApp(String appName) {
//        CartoonTransferResult<CartoonTransferDTO> result = new CartoonTransferResult<CartoonTransferDTO>();
//        try {
//            if (appName == null) {
//                throw new ArgumentException(ExceptionCode.PARAM_ERROR.getErrorCode(), "appName is null");
//            }
//            cartoonTransferDTO cartoonTransferDTO = cartoonTransferManager.findByApp(appName);
//            result.setSuccess(true);
//            result.setValue(cartoonTransferDTO);
//            return result;
//
//        } catch (ArgumentException ae) {
//            String errorMsg = String.format("update failure:params:" + appName);
//            Log.error(errorMsg, ae);
//            result.setErrorCode(ae.getErrorCode());
//            result.setErrorMsg(ae.getMessage());
//            return result;
//        } catch (RepositoryException re) {
//            String errorMsg = String.format("update failure:params:" + appName);
//            Log.error(errorMsg, re);
//            result.setErrorCode(re.getErrorCode());
//            result.setErrorMsg(re.getMessage());
//        } catch (Throwable th) {
//            String errorMsg = String.format("update failure:params:" + appName);
//            Log.error(errorMsg, th);
//            result.setErrorCode(result.getErrorCode());
//            result.setErrorMsg(result.getErrorMsg());
//            return result;
//        }
//        return result;
//    }
//
//}
