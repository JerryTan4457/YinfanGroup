//package com.yfkj.datacenter.biz.repository;
//
//import com.yfkj.datacenter.api.exception.ExceptionCode;
//import com.yfkj.datacenter.api.exception.RepositoryException;
//import com.yfkj.datacenter.api.query.AppTransferQuery;
//import com.yfkj.datacenter.biz.dao.CartoonTransferMapper;
//import com.yfkj.datacenter.biz.domain.CartoonTransferDO;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * @author Jerry Tan
// * @date 2017\12\27 0027 15:14
// */
//public class CartoonTransferRepository {
//    @Autowired
//    private CartoonTransferMapper cartoonTransferMapper;
//
//    public List<CartoonTransferDO> findByApp(AppTransferQuery query) {
//        try {
//            Map<String, Object> params = new HashMap<String, Object>();
//        } catch (Throwable th) {
//            throw new RepositoryException(ExceptionCode.DB_ERROR.getErrorCode(), ExceptionCode.DB_ERROR.getErrorMsg());
//        }
//        return null;
//    }
//
//    public List<CartoonTransferDO> findByApp(String appName) {
//        try{
//            Map<String,Object> params = new HashMap<String, Object>();
//            params.put("appName",appName);
//            return cartoonTransferMapper.findByApp(params);
//        }catch (Throwable th){
//            throw new RepositoryException(ExceptionCode.DB_ERROR.getErrorCode(),ExceptionCode.DB_ERROR.getErrorMsg());
//        }
//    }
//}