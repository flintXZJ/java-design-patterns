//package com.xzj.stu.design.createdmodel.builderpattern;
//
///**
// * @author zhijunxie
// * @date 2019/3/15
// */
//public class OrderBuilder {
//    private Burger burger;
//    private Suit suit;
//
//    /**
//     * 单点汉堡,num为数量
//     *
//     * @param burger
//     * @param num
//     * @return
//     */
//    public OrderBuilder burger(Burger burger, int num){
//        this.burger = burger;
//        return this;
//    }
//
//    /**
//     * 点套餐，实际中套餐也可以点多份
//     *
//     * @param suit
//     * @param num
//     * @return
//     */
//    public OrderBuilder suit(Suit suit, int num){
//        this.suit = suit;
//        return this;
//    }
//
//    /**
//     * 完成订单
//     *
//     * @return
//     */
//    public Order build(){
//        Order order = new Order();
//        order.setBurger(burger);
//        order.setSuit(suit);
//        return order;
//    }
//}
