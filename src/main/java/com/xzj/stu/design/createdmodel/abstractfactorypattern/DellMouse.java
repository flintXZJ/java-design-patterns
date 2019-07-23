package com.xzj.stu.design.createdmodel.abstractfactorypattern;

/**
 * concrete product B1
 *
 * @author zhijunxie
 * @date 2019/3/15
 */
public class DellMouse implements Mouse {
    @Override
    public void move() {
        System.out.println("dell mouse move the mouse");
    }
}
