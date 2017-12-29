//package com.yfkj.datacenter.biz.manager;
//
//import com.yfkj.datacenter.api.model.param.CartoonTransferDTO;
//import com.yfkj.datacenter.biz.domain.CartoonTransferDO;
//import com.yfkj.datacenter.biz.manager.helper.CartoonTransferHelper;
//import com.yfkj.datacenter.biz.repository.CartoonTransferRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// * @author Jerry Tan
// * @date 2017\12\28 0028 15:40
// */
//public class CartoonTransferManager {
//    @Autowired
//    private CartoonTransferRepository cartoonTransferRepository;
//    @Autowired
//    private CartoonTransferHelper cartoonTransferHelper;
//
//    public CartoonTransferDTO findByApp(String appName) {
//        CartoonTransferDO cartoonTransferDO = (CartoonTransferDO) cartoonTransferRepository.findByApp(appName);
//        CartoonTransferDTO cartoonTransferDTO = cartoonTransferHelper.convertToDTO(cartoonTransferDO);
//        return cartoonTransferDTO;
//    }
//}
