package com.xzj.stu.design.createdmodel.singletonpattern;

import java.lang.reflect.Constructor;

/**
 * 反射机制破解单例模式（枚举除外）
 *
 * @author zhijunxie
 * @date 2019/3/15
 */
public class ReflectionBreakSingleton {
    public static void main(String[] args) throws Exception {
        Class clazz  = Class.forName("com.xzj.stu.design.createdmodel.singletonpattern.HungryMode");
//        Class clazz  = Class.forName("com.xzj.stu.design.createdmodel.singletonpattern.LazyMode");
//        Class clazz  = Class.forName("com.xzj.stu.design.createdmodel.singletonpattern.DoubleCheckMode");
//        Class clazz  = Class.forName("com.xzj.stu.design.createdmodel.singletonpattern.InnerStaticMode");
//        Class clazz  = Class.forName("com.xzj.stu.design.createdmodel.singletonpattern.EnumMode");
        Constructor c = clazz.getDeclaredConstructor(null);

        c.setAccessible(true);

        HungryMode h1 = (HungryMode) c.newInstance();
        HungryMode h2 = (HungryMode) c.newInstance();

        System.out.println(h1);
        System.out.println(h2);
    }

//    解决以上漏洞的方法:
//    private Singleton() {
//        //在构造器中加个逻辑判断,多次调用抛出异常
//        if(instance!= null){
//            throw new RuntimeException();
//        }
//    }
}
