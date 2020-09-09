package com.xzj.stu.design.createdmodel.builderpattern;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhijunxie
 * @date 2019/3/15
 */
@Getter
public class Order {
    private Burger burger;
    private Suit suit;

    public static class OrderBuilder {
        private Order order = new Order();

        /**
         * 单点汉堡,num为数量
         *
         * @param burger
         * @param num
         * @return
         */
        public OrderBuilder burger(Burger burger, int num){
            order.burger = burger;
            return this;
        }

        /**
         * 点套餐，实际中套餐也可以点多份
         *
         * @param suit
         * @param num
         * @return
         */
        public OrderBuilder suit(Suit suit, int num){
            order.suit = suit;
            return this;
        }

        /**
         * 完成订单
         *
         * @return
         */
        public Order build(){
            return order;
        }
    }
}
