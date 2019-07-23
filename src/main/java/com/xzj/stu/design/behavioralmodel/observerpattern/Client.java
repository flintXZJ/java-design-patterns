package com.xzj.stu.design.behavioralmodel.observerpattern;

/**
 * @author zhijunxie
 * @date 2019/4/2
 */
public class Client {
    public static void main(String[] args) {
        //先定义一个主题
        Subject subject = new Subject();
        //定义观察者
        new BinaryObserver(subject);
        new HexaObserver(subject);
        //模拟数据变更，这个时候，观察者们的 update 方法将会被调用
        subject.setState(11);
    }
}
