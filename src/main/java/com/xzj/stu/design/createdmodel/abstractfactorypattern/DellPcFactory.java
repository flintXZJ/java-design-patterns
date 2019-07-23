package com.xzj.stu.design.createdmodel.abstractfactorypattern;

/**
 * concrete factory1
 *
 * @author zhijunxie
 * @date 2019/3/15
 */
public class DellPcFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new DellKeybo();
    }
}
