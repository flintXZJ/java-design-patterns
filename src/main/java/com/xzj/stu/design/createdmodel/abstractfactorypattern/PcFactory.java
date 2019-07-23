package com.xzj.stu.design.createdmodel.abstractfactorypattern;

/**
 * abstract factory
 *
 * @author zhijunxie
 * @date 2019/3/15
 */
public interface PcFactory {
    public Mouse createMouse();
    public Keybo createKeybo();
}
