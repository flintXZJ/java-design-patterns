package com.xzj.stu.design.behavioralmodel.strategypattern.impl;

import com.xzj.stu.design.behavioralmodel.strategypattern.Strategy;

/**
 * 具体策略实现类
 *
 * @author zhijunxie
 * @date 2019/4/2
 */
public class BluePen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用蓝色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
