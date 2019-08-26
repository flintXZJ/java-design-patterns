package com.xzj.stu.design;

import com.xzj.stu.design.structuredmodel.adapterpattern.one.WildCock;

/**
 * javap -c XXX.class
 *
 *
 *
 * @author zhijunxie
 * @date 2019/8/26 18:16
 */
public class DissembleTest {
    public static void main(String[] args) {
        /**
         * DissembleTest.class反汇编
         *
         *      Code:
         *        //创建 WildCock 对象实例，分配内存
         *        0: new           #2                  // class com/xzj/stu/design/structuredmodel/adapterpattern/one/WildCock
         *        //复制栈顶地址，并再将其压入栈顶
         *        3: dup
         *        //调用构造器方法，初始化 WildCock 对象
         *        4: invokespecial #3                  // Method com/xzj/stu/design/structuredmodel/adapterpattern/one/WildCock."<init>":()V
         *        //存入局部方法变量表
         *        7: astore_1
         */
        WildCock wildCock = new WildCock();
        /**
         *        8: aload_1
         *        9: invokevirtual #4                  // Method com/xzj/stu/design/structuredmodel/adapterpattern/one/WildCock.fly:()V
         *       12: return
         */
        wildCock.fly();

        /**
         * 从字节码可以看到创建一个对象实例，可以分为三步
         * 1、分配对象内存
         * 2、调用构造器方法，执行初始化
         * 3、将对象引用赋值给变量。
         *
         * 虚拟机实际运行时，以上指令可能发生重排序。
         * 以上代码 2,3 可能发生重排序，但是并不会重排序 1 的顺序。
         * 也就是说 1 这个指令都需要先执行，因为 2,3 指令需要依托 1 指令执行结果
         *
         * 虽然重排序并不影响单线程内的执行结果，但是在多线程的环境就带来一些问题：
         * double check locked 代码：
         *
         * private DoubleCheckMode doubleCheckMode;
         * public DoubleCheckMode getInstance() {
         *      if (this.doubleCheckMode == null) {
         *          synchronized (DoubleCheckMode.class) {
         *              if (this.doubleCheckMode == null) {
         *                  this.doubleCheckMode = new DoubleCheckMode();
         *              }
         *          }
         *      }
         * }
         *
         * -------------------
         *    |线程1      |线程2
         * -------------------
         * t1 |分配内存   |
         * -------------------
         * t2 |变量赋值   |
         * -------------------
         * t3 |          |判断对象是否为null
         * -------------------
         * t4 |          |由于对象不为null, 访问该对象
         * -------------------
         * t5 |初始化对象 |
         *-------------------
         *
         * 上面错误双重检查锁定的示例代码中，如果线程 1 获取到锁进入创建对象实例，这个时候发生了指令重排序。
         * 当线程1 执行到 t3 时刻，线程 2 刚好进入，由于此时对象已经不为 Null，所以线程 2 可以自由访问该对象。
         * 然后该对象还未初始化，所以线程 2 访问时将会发生异常。
         *
         * 因此需要在doubleCheckMode变量加修饰符volatile。
         *
         * 正确的双重检查锁定模式需要需要使用 volatile。volatile主要包含两个功能
         * 1、保证可见性。使用 volatile 定义的变量，将会保证对所有线程的可见性
         * 2、禁止指令重排序优化
         *
         */

    }
}
