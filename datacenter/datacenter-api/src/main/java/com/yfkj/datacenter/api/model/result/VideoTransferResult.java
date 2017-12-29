package com.yfkj.datacenter.api.model.result;

/**
 * @author Jerry Tan
 * @date 2017\12\26 0026 16:10
 */
public class VideoTransferResult<T> extends BaseResult{
    private T value;
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }

}
