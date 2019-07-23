package com.xzj.stu.design.behavioralmodel.mediatorpattern;

/**
 * @author zhijunxie
 * @date 2019/4/3
 */
public class Client {
    public static void main(String[] args) {
        AbstractCardPartner a = new PartnerA();
        AbstractCardPartner b = new PartnerB();
        a.setMoney(20);
        b.setMoney(20);

        AbstractMediator mediator = new MediatorPater(a, b);

        // A赢了
        a.changeMoney(5, mediator);
        System.out.println("A 现在的钱是："+a.getMoney());
        System.out.println("B 现在的钱是："+b.getMoney());

        // B赢了
        b.changeMoney(10, mediator);
        System.out.println("A 现在的钱是："+a.getMoney());
        System.out.println("B 现在的钱是："+b.getMoney());
    }
}
