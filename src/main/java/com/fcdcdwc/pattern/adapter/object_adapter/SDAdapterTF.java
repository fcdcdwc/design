package com.fcdcdwc.pattern.adapter.object_adapter;

/**
 * @version v1.0
 * @ClassName: SDAdapterTF
 * @Description: 适配器类
 * @Author: fcdcdwc
 */
public  class SDAdapterTF implements SDCard {

    private TFCard tfCard;
    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public String readSD() {
        return null;
    }

    public void writeSD(String msg) {

    }
}
