package com.xzj.stu.design.structuredmodel.proxypattern;

/**
 * @author zhijunxie
 * @date 2019/3/18
 */
public class Client {
    public static void main(String[] args) {
        // 这里用代理类来实例化
        FoodService foodService = new FoodServiceProxy();
        foodService.makeChicken();
    }
}
