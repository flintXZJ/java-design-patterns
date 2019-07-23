package com.xzj.stu.design.structuredmodel.bridgepattern.sub;

import com.xzj.stu.design.structuredmodel.bridgepattern.DrawAPI;
import com.xzj.stu.design.structuredmodel.bridgepattern.Shape;

/**
 * @author zhijunxie
 * @date 2019/4/1
 */
public class Rectangle extends Shape {
    private int x;
    private int y;

    public Rectangle(int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.draw(0, x, y);
    }
}
