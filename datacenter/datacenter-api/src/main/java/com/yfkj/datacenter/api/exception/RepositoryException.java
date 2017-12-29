package com.yfkj.datacenter.api.exception;

/**
 * @author Jerry Tan
 * @date 2017\12\21 0021 15:14
 */
public class RepositoryException extends RuntimeException{

    private String errorCode;

    public String getErrorCode(){
        return errorCode;
    }

    public RepositoryException(String errorCode,String errorMsg){
        super(errorMsg);
        this.errorCode=errorCode;
    }

    public RepositoryException(ExceptionCode exceptionCode){
        super(exceptionCode.getErrorMsg());
        this.errorCode=errorCode;
    }

    public RepositoryException(String errorCode,String errorMsg,Throwable cause){
        super(errorMsg,cause);
        this.errorCode=errorCode;
    }

    public String getExceptionCode() {
        return this.getExceptionCode();
    }
}