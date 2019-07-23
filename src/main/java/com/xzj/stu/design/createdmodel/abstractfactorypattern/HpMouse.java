package com.xzj.stu.design.createdmodel.abstractfactorypattern;

/**
 * concrete product B2
 *
 * @author zhijunxie
 * @date 2019/3/15
 */
public class HpMouse implements Mouse {
    @Override
    public void move() {
        System.out.println("hp mouse move the mouse");
    }
}
