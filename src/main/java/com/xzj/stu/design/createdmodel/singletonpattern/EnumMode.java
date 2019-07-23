package com.xzj.stu.design.createdmodel.singletonpattern;

/**
 * 枚举实现单例，不推荐在Android平台使用，因为内存消耗会其他方式多一些
 *
 * 这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。
 * 它更简洁，自动支持序列化机制，绝对防止多次实例化
 *
 * JVM会保证enum不能被反射并且构造器方法只执行一次
 *
 * @author zhijunxie
 * @date 2019/3/14
 */
public class EnumMode {
    private EnumMode() {}

    public static EnumMode getInstance() {
        return EnumSingleton.INSTANCE.getInstance();
    }

    private static enum EnumSingleton {
        INSTANCE;

        private EnumMode enumMode;

        /**
         * JVM会保证此方法绝对只调用一次
         */
        private EnumSingleton() {
            enumMode = new EnumMode();
        }

        public EnumMode getInstance() {
            return enumMode;
        }

    }
}
