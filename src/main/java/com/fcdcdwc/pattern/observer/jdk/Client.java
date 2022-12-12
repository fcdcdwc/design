package com.fcdcdwc.pattern.observer.jdk;

public class Client {
    public static void main(String[] args) {
        //创建小偷对象
        Thief t = new Thief("隔壁老王");
        //创建警察对象
        Policemen p = new Policemen("小李");
        //创建艳迪对象
        Liyandi l = new Liyandi();
        //让警察盯着小偷
        t.addObserver(p);
        t.addObserver(l);
        //小偷偷东西
        t.steal();
    }
}