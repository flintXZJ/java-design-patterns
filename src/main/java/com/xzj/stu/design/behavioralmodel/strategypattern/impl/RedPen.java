package com.xzj.stu.design.behavioralmodel.strategypattern.impl;

import com.xzj.stu.design.behavioralmodel.strategypattern.Strategy;

/**
 * 具体策略实现类
 *
 * @author zhijunxie
 * @date 2019/4/2
 */
public class RedPen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用红色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
