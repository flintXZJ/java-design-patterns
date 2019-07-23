package com.xzj.stu.design.structuredmodel.decoratorpattern;

/**
 * 饮料抽象基类
 *
 * @author zhijunxie
 * @date 2019/4/1
 */
public abstract class Beverage {
    // 返回描述
    public abstract String getDescription();
    // 返回价格
    public abstract double cost();
}
