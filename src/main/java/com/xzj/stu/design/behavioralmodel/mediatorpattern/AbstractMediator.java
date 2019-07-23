package com.xzj.stu.design.behavioralmodel.mediatorpattern;

/**
 * 抽象中介者类
 *
 * @author zhijunxie
 * @date 2019/4/3
 */
public abstract class AbstractMediator {
    protected AbstractCardPartner a;
    protected AbstractCardPartner b;

    public AbstractMediator(AbstractCardPartner a, AbstractCardPartner b) {
        this.a = a;
        this.b = b;
    }

    public abstract void AWin(int money);
    public abstract void BWin(int money);
}
