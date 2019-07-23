package com.xzj.stu.design.structuredmodel.bridgepattern;

/**
 * 桥梁
 * 我们首先需要一个桥梁，它是一个接口，定义提供的接口方法
 *
 * @author zhijunxie
 * @date 2019/4/1
 */
public interface DrawAPI {
    public void draw(int radius, int x, int y);
}
