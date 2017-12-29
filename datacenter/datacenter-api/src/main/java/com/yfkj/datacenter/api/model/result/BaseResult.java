package com.yfkj.datacenter.api.model.result;

/**
 * @author Jerry Tan
 * @date 2017\12\20 0020 11:13
 */
public class BaseResult<T> {
    private boolean success = false;
    private String errorMsg;
    private String errorCode;

    public BaseResult(){

    }
    public boolean isSuccess(){
        return success;
    }

    public void setSuccess(boolean success){
        this.success = success;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
