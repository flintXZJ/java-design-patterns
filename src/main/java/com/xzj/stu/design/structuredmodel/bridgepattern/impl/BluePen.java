package com.xzj.stu.design.structuredmodel.bridgepattern.impl;

import com.xzj.stu.design.structuredmodel.bridgepattern.DrawAPI;

/**
 * 桥梁实现类
 *
 * @author zhijunxie
 * @date 2019/4/1
 */
public class BluePen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用蓝色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
