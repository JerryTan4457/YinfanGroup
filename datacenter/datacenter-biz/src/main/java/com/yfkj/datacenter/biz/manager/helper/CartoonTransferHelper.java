//package com.yfkj.datacenter.biz.manager.helper;
//
//import com.yfkj.datacenter.api.model.param.CartoonTransferDTO;
//import com.yfkj.datacenter.biz.domain.CartoonTransferDO;
//
//import java.text.DecimalFormat;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author Jerry Tan
// * @date 2017\12\28 0028 10:58
// */
//public class CartoonTransferHelper {
//    @Override
//    public List<CartoonTransferDTO> convertToDTO(List<CartoonTransferDO> modelDOs) {
//        DecimalFormat df = new DecimalFormat("0.00");
//        List<CartoonTransferDTO> dtoList = new ArrayList<CartoonTransferDTO>();
//        for (CartoonTransferDO modelDO : modelDOs) {
//            dtoList.add(convertToDTO(modelDO));
//        }
//        return dtoList;
//    }
//}
