#### 这些设计模式关注类和对象的组合。
#### 继承的概念被用来组合接口和定义组合对象获得新功能的方式。

### 结构型模式
1. 代理模式（Proxy Pattern）
    > * 注意事项： 
    > * 1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。 
    > * 2、和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制
    > * UML图![UML图](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1552910182076&di=bed17367981b921d975500389dcd2bde&imgtype=0&src=http%3A%2F%2Fww1.sinaimg.cn%2Flarge%2F006rMFVegy1fdpnfxbh3oj30j60ayglq.jpg)
2. 适配器模式（Adapter Pattern）
org.apache.dubbo.remoting.transport.netty4.NettyCodecAdapter
    > * 1、类适配和对象适配的异同：
    > * > 一个采用继承，一个采用组合；
    > * > 类适配属于静态实现，对象适配属于组合的动态实现，对象适配需要多实例化一个对象。
    > * > 总体来说，对象适配用得比较多。 
    > * 2、适配器模式和代理模式的异同
    > * > 比较这两种模式，其实是比较对象适配器模式和代理模式，在代码结构上，它们很相似，都需要一个具体的实现类的实例。但是它们的目的不一样，代理模式做的是增强原方法的活；适配器做的是适配的活，为的是提供“把鸡包装成鸭，然后当做鸭来使用”，而鸡和鸭它们之间原本没有继承关系。
    > * ![compare](https://www.javadoop.com/blogimages/design-pattern/adapter-5.png)
3. 桥接模式（Bridge Pattern）
    > * UML![UML](https://www.javadoop.com/blogimages/design-pattern/bridge-1.png)
    > * 跟策略模式相似
    > * 策略模式UML![](https://www.javadoop.com/blogimages/design-pattern/strategy-1.png)
4. 装饰器模式（Decorator Pattern）
    > * Java IO 中的几个类是典型的装饰模式的应用
    > * UML![UML](https://www.javadoop.com/blogimages/design-pattern/decorator-1.png)
    > * 从名字来简单解释下装饰器。既然说是装饰，那么往往就是添加小功能这种，而且，我们要满足可以添加多个小功能。最简单的，代理模式就可以实现功能的增强，但是代理不容易实现多个功能的增强，当然你可以说用代理包装代理的方式，但是那样的话代码就复杂了。
5. 外观模式（Facade Pattern）
    > * slf4j 就可以理解为是门面模式的应用
    > * 隐藏系统的复杂性
6. 组合模式（Composite Pattern）
    > * 组合模式用于表示具有层次结构的数据，使得我们对单个对象和组合对象的访问具有一致性
7. 享元模式（Flyweight Pattern）
    > * 主要用于减少创建对象的数量，以减少内存占用和提高性能
    > * 复用对象最简单的方式是，用一个 HashMap 来存放每次新生成的对象
8. 过滤器模式（Filter、Criteria Pattern）(不在23中)