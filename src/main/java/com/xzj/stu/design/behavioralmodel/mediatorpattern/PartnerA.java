package com.xzj.stu.design.behavioralmodel.mediatorpattern;

/**
 * @author zhijunxie
 * @date 2019/4/3
 */
public class PartnerA extends AbstractCardPartner {
    @Override
    public void changeMoney(int money, AbstractMediator mediator) {
        mediator.AWin(money);
    }

}
