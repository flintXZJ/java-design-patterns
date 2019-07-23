package com.xzj.stu.design.structuredmodel.bridgepattern.sub;

import com.xzj.stu.design.structuredmodel.bridgepattern.DrawAPI;
import com.xzj.stu.design.structuredmodel.bridgepattern.Shape;

/**
 * 圆形
 *
 * @author zhijunxie
 * @date 2019/4/1
 */
public class Circle extends Shape {
    private int radius;

    public Circle(int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.draw(radius, 0, 0);
    }
}
