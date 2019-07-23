package com.xzj.stu.design.structuredmodel.decoratorpattern;

import com.xzj.stu.design.structuredmodel.decoratorpattern.sub.GreenTea;
import com.xzj.stu.design.structuredmodel.decoratorpattern.sub.Lemon;
import com.xzj.stu.design.structuredmodel.decoratorpattern.sub.Mango;

/**
 * @author zhijunxie
 * @date 2019/4/1
 */
public class Client {
    public static void main(String[] args) {
        // 首先，我们需要一个基础饮料，红茶、绿茶或咖啡
        Beverage beverage = new GreenTea();

        // 开始装饰
        beverage = new Lemon(beverage);
        beverage = new Mango(beverage);

        System.out.println(beverage.getDescription() + " 价格：￥" + beverage.cost());
    }
}
