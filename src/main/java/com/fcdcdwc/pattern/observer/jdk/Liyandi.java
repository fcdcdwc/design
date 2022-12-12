package com.fcdcdwc.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Liyandi implements Observer {
    private String name;

    {
        name = "艳迪";
    }
    public Liyandi() {
        
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("艳迪：" + ((Thief) o).getName() + "，小偷你好,我是艳迪！！！");
    }
}