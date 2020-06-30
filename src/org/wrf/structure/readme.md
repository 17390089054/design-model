1. 适配器（Adapter）
    目标：
        把一个类接口转换成另一个用户需要的接口。
    实现：
        鸭子（Duck）和火鸡（Turkey）拥有不同的叫声，Duck 的叫声调用 quack() 方法，而 Turkey 调用 gobble() 方法。
        要求将 Turkey 的 gobble() 方法适配成 Duck 的 quack() 方法，从而让火鸡冒充鸭子！
    应用：
        JDK
        java.util.Arrays#asList()
        java.util.Collections#list()
        java.util.Collections#enumeration()
        javax.xml.bind.annotation.adapters.XMLAdapter     
   
2. 桥接（Bridge）
    目标：
        将抽象与实现分离开来，使它们可以独立变化。
    实现：
        RemoteControl 表示遥控器，指代 Abstraction。
        TV 表示电视，指代 Implementor。
        桥接模式将遥控器和电视分离开来，从而可以独立改变遥控器或者电视的实现。
    应用：
        JDK
        AWT (It provides an abstraction layer which maps onto the native OS the windowing support.)
        JDBC

3. 组合（Composite）
    目标：
        将对象组合成树形结构来表示“整体/部分”层次关系，允许用户以相同的方式处理单独对象和组合对象。
    实现：
        组件（Component）类是组合类（Composite）和叶子类（Leaf）的父类，可以把组合类看成是树的中间节点。
        组合对象拥有一个或者多个组件对象，因此组合对象的操作可以委托给组件对象去处理，而组件对象可以是另一个组合对象或者叶子对象。
    应用：
        JDK
        javax.swing.JComponent#add(Component)
        java.awt.Container#add(Component)
        java.util.Map#putAll(Map)
        java.util.List#addAll(Collection)
        java.util.Set#addAll(Collection)
        
4. 装饰（Decorator）
    目标：
        为对象动态添加功能。
    实现：
        装饰者（Decorator）和具体组件（ConcreteComponent）都继承自组件（Component），具体组件的方法实现不需要依赖于其它对象，
        而装饰者组合了一个组件，这样它可以装饰其它装饰者或者具体组件。所谓装饰，就是把这个装饰者套在被装饰者之上，从而动态扩展被装饰者的功能。
        装饰者的方法有一部分是自己的，这属于它的功能，然后调用被装饰者的方法实现，从而也保留了被装饰者的功能。
        可以看到，具体组件应当是装饰层次的最低层，因为只有具体组件的方法实现不需要依赖于其它对象。
        设计不同种类的饮料，饮料可以添加配料，比如可以添加牛奶，并且支持动态添加新配料。每增加一种配料，该饮料的价格就会增加，要求计算一种饮料的价格。
    设计原则:
        类应该对扩展开放，对修改关闭：也就是添加新功能时不需要修改代码。饮料可以动态添加新的配料，而不需要去修改饮料的代码。
        不可能把所有的类设计成都满足这一原则，应当把该原则应用于最有可能发生改变的地方。
    应用：
        JDK
        java.io.BufferedInputStream(InputStream)
        java.io.DataInputStream(InputStream)
        java.io.BufferedOutputStream(OutputStream)
        java.util.zip.ZipOutputStream(OutputStream)
        java.util.Collections#checkedList|Map|Set|SortedSet|SortedMap  

5. 外观（Facade）
    目标：
        提供了一个统一的接口，用来访问子系统中的一群接口，从而让子系统更容易使用。
    实现：
        观看电影需要操作很多电器，使用外观模式实现一键看电影功能。
    设计原则：
        最少知识原则：只和你的密友谈话。也就是说客户对象所需要交互的对象应当尽可能少。
        
6. 享元（Flyweight）
    目标：
        利用共享的方式来支持大量细粒度的对象，这些对象一部分内部状态是相同的。
    实现：
        Flyweight：享元对象
        IntrinsicState：内部状态，享元对象共享内部状态
        ExtrinsicState：外部状态，每个享元对象的外部状态不同
    应用：
        JDK
        Java 利用缓存来加速大量小对象的访问时间。
     
        java.lang.Integer#valueOf(int)
        java.lang.Boolean#valueOf(boolean)
        java.lang.Byte#valueOf(byte)
        java.lang.Character#valueOf(char)
        
7. 代理（Proxy）
    目标：
        控制对其它对象的访问。
    实现：
        代理有以下四类：
        远程代理（Remote Proxy）：控制对远程对象（不同地址空间）的访问，它负责将请求及其参数进行编码，并向不同地址空间中的对象发送已经编码的请求。
        虚拟代理（Virtual Proxy）：根据需要创建开销很大的对象，它可以缓存实体的附加信息，以便延迟对它的访问，例如在网站加载一个很大图片时，不能马上完成，可以用虚拟代理缓存图片的大小信息，然后生成一张临时图片代替原始图片。
        保护代理（Protection Proxy）：按权限控制对象的访问，它负责检查调用者是否具有实现一个请求所必须的访问权限。
        智能代理（Smart Reference）：取代了简单的指针，它在访问对象时执行一些附加操作：记录对象的引用次数；当第一次引用一个对象时，将它装入内存；在访问一个实际对象前，检查是否已经锁定了它，以确保其它对象不能改变它。
    
        以下是一个虚拟代理的实现，模拟了图片延迟加载的情况下使用与图片大小相等的临时内容去替换原始图片，直到图片加载完成才将图片显示出来。
    应用：
        JDK
        java.lang.reflect.Proxy
        RMI        
