package com.xzj.stu.design.createdmodel.abstractfactorypattern;

/**
 * concrete factory2
 *
 * @author zhijunxie
 * @date 2019/3/15
 */
public class HpPcFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new HpKeybo();
    }
}
