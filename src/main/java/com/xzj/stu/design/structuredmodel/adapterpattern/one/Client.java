package com.xzj.stu.design.structuredmodel.adapterpattern.one;

/**
 * @author zhijunxie
 * @date 2019/4/1
 */
public class Client {
    public static void main(String[] args) {
        // 有一只野鸡
        Cock wildCock = new WildCock();
        // 成功将野鸡适配成鸭
        Duck duck = new CockAdapter(wildCock);
        duck.fly();
        duck.quack();
    }
}
