package com.xzj.stu.design.behavioralmodel.mediatorpattern;

import lombok.Getter;
import lombok.Setter;

/**
 * 抽象牌友类
 *
 * @author zhijunxie
 * @date 2019/4/3
 */
@Setter
@Getter
public abstract class AbstractCardPartner {
    public int money;

    public abstract void changeMoney(int money, AbstractMediator mediator);
}
