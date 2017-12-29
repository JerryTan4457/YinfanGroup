package com.yfkj.datacenter.api.exception;

/**
 * @author Jerry Tan
 * @date 2017\12\21 0021 15:22
 */
public class BusinessException extends RuntimeException {
    public BusinessException(String errorMsg){
        super(errorMsg);
    }
    public BusinessException(String errorMsg,Throwable cause){
        super(errorMsg, cause);
    }
}
