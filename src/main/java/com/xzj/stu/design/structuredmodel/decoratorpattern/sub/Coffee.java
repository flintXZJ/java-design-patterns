package com.xzj.stu.design.structuredmodel.decoratorpattern.sub;

import com.xzj.stu.design.structuredmodel.decoratorpattern.Beverage;

/**
 * 基础饮料实现类
 *
 * @author zhijunxie
 * @date 2019/4/1
 */
public class Coffee extends Beverage {
    @Override
    public String getDescription() {
        return "咖啡";
    }

    @Override
    public double cost() {
        return 12;
    }
}
