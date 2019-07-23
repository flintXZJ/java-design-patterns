package com.xzj.stu.design.structuredmodel.decoratorpattern.sub;

import com.xzj.stu.design.structuredmodel.decoratorpattern.Beverage;
import com.xzj.stu.design.structuredmodel.decoratorpattern.Condiment;

/**
 * 装饰者实现类
 *
 * @author zhijunxie
 * @date 2019/4/1
 */
public class Mango extends Condiment {
    private Beverage beverage;

    public Mango(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // 装饰
        return this.beverage.getDescription() + ", 加芒果";
    }

    @Override
    public double cost() {
        // 装饰
        return this.beverage.cost() + 3;
    }
}
