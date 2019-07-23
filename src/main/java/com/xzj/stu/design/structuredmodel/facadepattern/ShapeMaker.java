package com.xzj.stu.design.structuredmodel.facadepattern;

import com.xzj.stu.design.structuredmodel.facadepattern.impl.Circle;
import com.xzj.stu.design.structuredmodel.facadepattern.impl.Rectangle;

/**
 * 门面
 *
 * @author zhijunxie
 * @date 2019/4/2
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    /**
     * 下面定义一堆方法，具体应该调用什么方法，由这个门面来决定
     */
    public void drawCircle(){
        this.circle.draw();
    }
    public void drawRectangle(){
        this.rectangle.draw();
    }
}
