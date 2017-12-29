package com.yfkj.datacenter.api.exception;

/**
 * @author Jerry Tan
 * @date 2017\12\21 0021 15:18
 */
public class ServiceException extends RuntimeException{
//    private static final long serialVersionUID = -6438755184394143413L;
//    protected String exceptionCode;
    private String errorCode;

    public String getExrrorCode() {
        return this.errorCode;
    }

    public ServiceException(String exceptionCode,String errorMsg){
        super(errorMsg);
        this.errorCode = errorCode;
    }
    public ServiceException(String errorCode,String errorMsg,Throwable cause){
        super(errorMsg, cause);
        this.errorCode = errorCode;
    }
    public ServiceException(ExceptionCode exceptionCode){
        super(exceptionCode.getErrorMsg());
        this.errorCode = errorCode;
    }
}
