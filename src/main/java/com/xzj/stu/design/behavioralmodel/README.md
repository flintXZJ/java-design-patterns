#### 这些设计模式特别关注对象之间的通信。	

### 行为型模式
1. 策略模式（Strategy Pattern）
    > * UML![UML](https://www.javadoop.com/blogimages/design-pattern/strategy-1.png)
2. 观察者模式（Observer Pattern）
    > * 观察者订阅自己关心的主题和主题有数据变化后通知观察者们
    > * jdk提供了相似的支持，具体的可以参考 java.util.Observable 和 java.util.Observer 这两个类
3. 责任链模式（Chain of Responsibility Pattern）
    > * 代码其实很简单，就是先定义好一个链表，然后在通过任意一节点后，如果此节点有后继节点，那么传递下去
    > * UML![](http://www.runoob.com/wp-content/uploads/2014/08/chain_pattern_uml_diagram.jpg)
4. 模板模式（Template Pattern）
    > * UML![](http://www.runoob.com/wp-content/uploads/2014/08/template_pattern_uml_diagram.jpg)
5. 状态模式（State Pattern）
    > * UML![](http://www.runoob.com/wp-content/uploads/2014/08/state_pattern_uml_diagram.png)
6. 备忘录模式（Memento Pattern）
7. 中介者模式（Mediator Pattern）
    > * UML![](http://www.runoob.com/wp-content/uploads/2018/11/mediator-pattern23.jpeg)
8. 迭代器模式（Iterator Pattern）
9. 空对象模式（Null Object Pattern）
10. 解释器模式（Interpreter Pattern）
11. 命令模式（Command Pattern）
12. 访问者模式（Visitor Pattern）
