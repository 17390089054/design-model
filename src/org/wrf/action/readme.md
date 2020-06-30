1. 责任链（Chain Of Responsibility）
   目标：
        使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
        将这些对象连成一条链，并沿着这条链发送该请求，直到有一个对象处理它为止。
   实现：
        Handler：定义处理请求的接口，并且实现后继链（successor）
   应用：
        JDK
        java.util.logging.Logger#log()
        Apache Commons Chain
        javax.servlet.Filter#doFilter()

2. 命令（Command）
    目的：
        将命令封装成对象中，具有以下作用：
            使用命令来参数化其它对象
            将命令放入队列中进行排队
            将命令的操作记录到日志中
            支持可撤销的操作
   类定义：
        Command：命令
        Receiver：命令接收者，也就是命令真正的执行者
        Invoker：通过它来调用命令
        Client：可以设置命令与命令的接收者
   实现：    
        设计一个遥控器，可以控制电灯开关。
   应用：
        JDK
        java.lang.Runnable
        Netflix Hystrix
        javax.swing.Action
   
   
3. 解释器（Interpreter）
    目标：
        为语言创建解释器，通常由语言的语法和语法分析来定义。
    类定义：
        TerminalExpression：终结符表达式，每个终结符都需要一个 TerminalExpression。
        Context：上下文，包含解释器之外的一些全局信息。
    实现：
        以下是一个规则检验器实现，具有 and 和 or 规则，通过规则可以构建一颗解析树，用来检验一个文本是否满足解析树定义的规则。
        例如一颗解析树为 D And (A Or (B C))，文本 "D A" 满足该解析树定义的规则。
        这里的 Context 指的是 String。
    应用：
        JDK
        java.util.Pattern
        java.text.Normalizer
        All subclasses of java.text.Format
        javax.el.ELResolver
    
4. 迭代器（Iterator）
    目标：
        提供一种顺序访问聚合对象元素的方法，并且不暴露聚合对象的内部表示。
    类定义：
        Aggregate 是聚合类，其中 createIterator() 方法可以产生一个 Iterator；
        Iterator 主要定义了 hasNext() 和 next() 方法。
        Client 组合了 Aggregate，为了迭代遍历 Aggregate，也需要组合 Iterator。
    应用：
        JDK
        java.util.Iterator
        java.util.Enumeration
        
5. 中介者（Mediator）
    目的：
        集中相关对象之间复杂的沟通和控制方式。
    类定义：
        Mediator：中介者，定义一个接口用于与各同事（Colleague）对象通信。
        Colleague：同事，相关对象
    实现：
        Alarm（闹钟）、CoffeePot（咖啡壶）、Calendar（日历）、Sprinkler（喷头）是一组相关的对象，
        在某个对象的事件产生时需要去操作其它对象，形成了下面这种依赖结构：
        使用中介者模式可以将复杂的依赖结构变成星形结构：
    应用：
        JDK
        All scheduleXXX() methods of java.util.Timer
        java.util.concurrent.Executor#execute()
        submit() and invokeXXX() methods of java.util.concurrent.ExecutorService
        scheduleXXX() methods of java.util.concurrent.ScheduledExecutorService
        java.lang.reflect.Method#invoke()

6. 备忘录（Memento）
    目标：
        在不违反封装的情况下获得对象的内部状态，从而在需要时可以将对象恢复到最初状态。
    类定义：
        Originator：原始对象
        Caretaker：负责保存好备忘录
        Menento：备忘录，存储原始对象的的状态。备忘录实际上有两个接口，一个是提供给 Caretaker 的窄接口：
                它只能将备忘录传递给其它对象；一个是提供给 Originator 的宽接口，允许它访问到先前状态所需的所有数据。
                理想情况是只允许 Originator 访问本备忘录的内部状态。    
    实现：
        以下实现了一个简单计算器程序，可以输入两个值，然后计算这两个值的和。
        备忘录模式允许将这两个值存储起来，然后在某个时刻用存储的状态进行恢复。
    
    应用：
        JDK
        java.io.Serializable
    
7. 观察者（Observer）
    目标：
        定义对象之间的一对多依赖，当一个对象状态改变时，它的所有依赖都会收到通知并且自动更新状态。
        主题（Subject）是被观察的对象，而其所有依赖者（Observer）称为观察者。
    类定义：
        主题（Subject）具有注册和移除观察者、并通知所有观察者的功能，主题是通过维护一张观察者列表来实现这些操作的。
        观察者（Observer）的注册功能需要调用主题的 registerObserver() 方法。
    实现：
        天气数据布告板会在天气信息发生改变时更新其内容，布告板有多个，并且在将来会继续增加。
    应用：
        JDK
        java.util.Observer
        java.util.EventListener
        javax.servlet.http.HttpSessionBindingListener
        RxJava
 
 8. 状态（State）
    目标：
        允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它所属的类。
    实现：
        糖果销售机有多种状态，每种状态下销售机有不同的行为，状态可以发生转移，使得销售机的行为也发生改变。
            
 
 9. 策略（Strategy）
    目标：
        定义一系列算法，封装每个算法，并使它们可以互换。
        策略模式可以让算法独立于使用它的客户端。
    类定义：
        Strategy 接口定义了一个算法族，它们都实现了 behavior() 方法。
        Context 是使用到该算法族的类，其中的 doSomething() 方法会调用 behavior()，
        setStrategy(Strategy) 方法可以动态地改变 strategy 对象，也就是说能动态地改变 Context 所使用的算法。
        与状态模式的比较
        状态模式的类图和策略模式类似，并且都是能够动态改变对象的行为。
        但是状态模式是通过状态转移来改变 Context 所组合的 State 对象，而策略模式是通过 Context 本身的决策来改变组合的 Strategy 对象。
        所谓的状态转移，是指 Context 在运行过程中由于一些条件发生改变而使得 State 对象发生改变，注意必须要是在运行过程中。
        
        状态模式主要是用来解决状态转移的问题，当状态发生转移了，那么 Context 对象就会改变它的行为；
        而策略模式主要是用来封装一组可以互相替代的算法族，并且可以根据需要动态地去替换 Context 使用的算法。
    实现：
        设计一个鸭子，它可以动态地改变叫声。这里的算法族是鸭子的叫声行为。
    应用：
        JDK
        java.util.Comparator#compare()
        javax.servlet.http.HttpServlet
        javax.servlet.Filter#doFilter()

10. 模板方法（Template Method）
    目标：
        定义算法框架，并将一些步骤的实现延迟到子类。
        通过模板方法，子类可以重新定义算法的某些步骤，而不用改变算法的结构。
    实现：
        冲咖啡和冲茶都有类似的流程，但是某些步骤会有点不一样，要求复用那些相同步骤的代码。
    应用：
        JDK
        java.util.Collections#sort()
        java.io.InputStream#skip()
        java.io.InputStream#read()
        java.util.AbstractList#indexOf()

11. 访问者（Visitor）
    目标：
        为一个对象结构（比如组合结构）增加新能力。
    类定义：
        Visitor：访问者，为每一个 ConcreteElement 声明一个 visit 操作
        ConcreteVisitor：具体访问者，存储遍历过程中的累计结果
        ObjectStructure：对象结构，可以是组合结构，或者是一个集合。    
    应用：
        JDK
        javax.lang.model.element.Element and javax.lang.model.element.ElementVisitor
        javax.lang.model.type.TypeMirror and javax.lang.model.type.TypeVisitor

12. 空对象（Null）
    目标：
        使用什么都不做的空对象来代替 NULL。
        一个方法返回 NULL，意味着方法的调用端需要去检查返回值是否是 NULL，这么做会导致非常多的冗余的检查代码。
        并且如果某一个调用端忘记了做这个检查返回值，而直接使用返回的对象，那么就有可能抛出空指针异常。     
       

        

    
    