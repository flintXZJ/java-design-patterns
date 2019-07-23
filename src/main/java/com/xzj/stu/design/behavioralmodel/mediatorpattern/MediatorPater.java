package com.xzj.stu.design.behavioralmodel.mediatorpattern;

/**
 * @author zhijunxie
 * @date 2019/4/3
 */
public class MediatorPater extends AbstractMediator{

    public MediatorPater(AbstractCardPartner a, AbstractCardPartner b) {
        super(a,b);
    }

    @Override
    public void AWin(int money) {
        a.setMoney(a.getMoney()+money);
        b.setMoney(b.getMoney()-money);
    }

    @Override
    public void BWin(int money) {
        a.setMoney(a.getMoney()-money);
        b.setMoney(b.getMoney()+money);
    }
}
