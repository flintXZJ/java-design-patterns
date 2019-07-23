package com.xzj.stu.design.createdmodel.singletonpattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Double Check Lock
 * 懒加载、线程安全、效率高
 *
 * @author zhijunxie
 * @date 2019/3/14
 */
public class DoubleCheckMode implements Serializable {

    private static volatile DoubleCheckMode doubleCheckMode;

    private DoubleCheckMode() {
        //在构造器中加个逻辑判断,多次调用抛出异常
        if (doubleCheckMode != null) {
            throw new RuntimeException();
        }
        System.out.println("createthread " + getClass().getSimpleName());
    }

    /**
     * 因为同步锁的机制，多个线程获取类实例对象会排队等待获取锁，这样是没必要的，
     * 因为大多数情况下类实例对象都已经创建成功了，所以不用进入加锁的代码块，
     * 于是就可以再次改进LazyMode代码为双重校验的单例模式.
     * <p>
     * 能够做到效率和安全的双重保证
     *
     * @return
     */
    public static DoubleCheckMode getInstance() {
        if (doubleCheckMode == null) {
            synchronized (DoubleCheckMode.class) {
                if (doubleCheckMode == null) {
                    doubleCheckMode = new DoubleCheckMode();
                }
            }
        }
        return doubleCheckMode;
    }

    /**
     * 反序列化定义该方法，则不需要创建新对象
     *
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return doubleCheckMode;
    }
}
