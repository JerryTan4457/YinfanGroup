package com.yfkj.datacenter.api.exception;

/**
 * @author Jerry Tan
 * @date 2017\12\20 0020 11:48
 */
public class ArgumentException extends RuntimeException{

    private String errorCode;
    private String exceptionCode;

    public String getErrorCode() {
        return errorCode;
    }

    public ArgumentException(String errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
    }

    public ArgumentException(ExceptionCode exceptionCode) {
        super(exceptionCode.getErrorMsg());
        this.errorCode = exceptionCode.getErrorCode();
    }

    public ArgumentException(String errorCode, String errorMsg, Throwable cause) {
        super(errorMsg, cause);
        this.errorCode = errorCode;
    }

    public String getExceptionCode() {
        return exceptionCode;
    }
}