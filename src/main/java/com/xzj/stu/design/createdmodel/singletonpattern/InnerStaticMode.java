package com.xzj.stu.design.createdmodel.singletonpattern;

/**
 * 利用静态类只会加载一次的机制，使用静态内部类持有单例对象，达到单例的效果;
 *
 * 静态内部类的方式实现单例，可以保证多线程的对象唯一性，还有提升性能，不用同步锁机制
 * @author zhijunxie
 * @date 2019/3/14
 */
public class InnerStaticMode {

    private InnerStaticMode(){System.out.println("createthread " + getClass().getSimpleName());}

    private static class SingleTonHolder {
        /**
         * 要不要加final？？？
         */
        private static InnerStaticMode innerStaticMode = new InnerStaticMode();
    }

    public static InnerStaticMode getInstance() {
        return SingleTonHolder.innerStaticMode;
    }
}
