package com.xzj.stu.design.structuredmodel.adapterpattern.one;

/**
 * @author zhijunxie
 * @date 2019/4/1
 */
public class WildCock implements Cock {
    @Override
    public void gobble() {
        System.out.println("咕咕叫");
    }

    @Override
    public void fly() {
        System.out.println("鸡也会飞哦");
    }
}
