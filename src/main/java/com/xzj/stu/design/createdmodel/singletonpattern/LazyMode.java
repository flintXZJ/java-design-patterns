package com.xzj.stu.design.createdmodel.singletonpattern;

/**
 * 懒汉式
 * 懒加载、线程安全、效率低
 *
 * @author zhijunxie
 * @date 2019/3/14
 */
public class LazyMode {

    /**
     * volatile能保证对象的可见性，即在工作内存的内容更新能立即在主内存中可见
     */
    private static volatile LazyMode lazyMode;

    private LazyMode() {
        System.out.println("createthread " + getClass().getSimpleName());
    }

    /**
     * 第一次调用才初始化，避免内存浪费
     * 必须加锁 synchronized 才能保证单例，但加锁会影响效率
     * @return
     */
    public static LazyMode getInstance() {
        synchronized (LazyMode.class) {
            if (lazyMode == null) {
                lazyMode = new LazyMode();
            }
        }
        return lazyMode;
    }
}
