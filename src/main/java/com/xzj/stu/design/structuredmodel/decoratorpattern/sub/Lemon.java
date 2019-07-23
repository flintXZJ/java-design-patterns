package com.xzj.stu.design.structuredmodel.decoratorpattern.sub;

import com.xzj.stu.design.structuredmodel.decoratorpattern.Beverage;
import com.xzj.stu.design.structuredmodel.decoratorpattern.Condiment;

/**
 * 装饰者实现类
 * 具体的调料，它们属于装饰者，毫无疑问，这些调料肯定都需要继承 Condiment 类
 *
 * @author zhijunxie
 * @date 2019/4/1
 */
public class Lemon extends Condiment {
    private Beverage beverage;

    /**
     * 这里很关键，需要传入具体的饮料，如需要传入没有被装饰的红茶或绿茶，
     * 当然也可以传入已经装饰好的芒果绿茶，这样可以做芒果柠檬绿茶
     */
    public Lemon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // 装饰
        return this.beverage.getDescription() + ", 加柠檬";
    }

    @Override
    public double cost() {
        // 装饰
        return this.beverage.cost() + 2;
    }
}
