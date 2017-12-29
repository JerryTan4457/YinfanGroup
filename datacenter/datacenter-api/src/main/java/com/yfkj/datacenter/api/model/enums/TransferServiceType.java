package com.yfkj.datacenter.api.model.enums;

/**
 * @author Jerry Tan
 * @date 2017\12\21 0021 11:15
 */
public enum TransferServiceType {
    VIDEO(1,"视频");

    int value;
    String text;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    TransferServiceType(int value,String text){
        this.value = value;
        this.text = text;
    }
}
