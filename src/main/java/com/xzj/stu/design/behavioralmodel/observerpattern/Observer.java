package com.xzj.stu.design.behavioralmodel.observerpattern;

/**
 * @author zhijunxie
 * @date 2019/4/2
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
