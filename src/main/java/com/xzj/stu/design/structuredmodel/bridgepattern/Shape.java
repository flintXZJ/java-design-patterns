package com.xzj.stu.design.structuredmodel.bridgepattern;

/**
 * 定义一个抽象类，此类的实现类都需要使用 DrawAPI
 *
 * @author zhijunxie
 * @date 2019/4/1
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
