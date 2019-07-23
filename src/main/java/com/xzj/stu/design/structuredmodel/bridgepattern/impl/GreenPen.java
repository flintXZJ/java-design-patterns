package com.xzj.stu.design.structuredmodel.bridgepattern.impl;

import com.xzj.stu.design.structuredmodel.bridgepattern.DrawAPI;

/**
 * 桥梁实现类
 *
 * @author zhijunxie
 * @date 2019/4/1
 */
public class GreenPen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用绿色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
