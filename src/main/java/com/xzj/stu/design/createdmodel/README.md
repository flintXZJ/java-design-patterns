#### 这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。
#### 这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。

### 创建型模式
1. 简单工厂模式（Simple Factory Pattern）(不在23中)
    > * 一个工厂类根据传入的参量决定创建出那一种产品类的实例
    > * UML图![UML图](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551963188999&di=0d1e5df300e429549d2a272b3599ad1d&imgtype=jpg&src=http%3A%2F%2Fimg4.imgtn.bdimg.com%2Fit%2Fu%3D2067476079%2C1796698802%26fm%3D214%26gp%3D0.jpg)
2. 工厂模式（Factory Pattern）
    > * 定义一个创建对象的接口，让子类决定实例化那个类。
    > * UML图![UML图](https://images2017.cnblogs.com/blog/401339/201709/401339-20170929204041684-1520979160.png)
3. 抽象工厂模式（Abstract Factory Pattern）
    > * 违反了对修改关闭，对扩展开放这个设计原则
    > * 创建相关或依赖对象的家族，而无需明确指定具体类
    > * UML图![UML图](http://www.runoob.com/wp-content/uploads/2018/07/1530601916-7298-DP-AbstractFactory.png)
4. 单例模式（Singleton Pattern）
    > * 某个类只能有一个实例，提供一个全局的访问点
5. 建造者模式（Builder Pattern）
    > * 封装一个复杂对象的构建过程，并可以按步骤构造
6. 原型模式（Prototype Pattern）
    > * 通过复制现有的实例来创建新的实例
    > * 这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用
