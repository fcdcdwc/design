package com.fcdcdwc.pattern.proxy.jdk_proxy;

/**
 * @version v1.0
 * @ClassName: TrainStation
 * @Description: 火车站类
 * @Author: fcdcdwc
 */
public class TrainStation implements SellTickets {

    public void sell() {
        System.out.println("火车站卖票");
    }
}