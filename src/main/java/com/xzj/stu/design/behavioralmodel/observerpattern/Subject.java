package com.xzj.stu.design.behavioralmodel.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义主题
 * 每个主题需要持有观察者列表的引用，用于在数据变更的时候通知各个观察者
 *
 * @author zhijunxie
 * @date 2019/4/2
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        // 数据已变更，通知观察者们
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    // 通知观察者们
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
