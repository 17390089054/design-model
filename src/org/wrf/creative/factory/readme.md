简单工厂（Simple Factory）
    目标：
        在创建一个对象时不向客户暴露内部细节，并提供一个创建对象的通用接口。
    实现： 
        简单工厂把实例化的操作单独放到一个类中，这个类就成为简单工厂类，让简单工厂类来决定应该用哪个具体子类来实例化。
        这样做能把客户类和具体子类的实现解耦，客户类不再需要知道有哪些子类以及应当实例化哪个子类。
        客户类往往有多个，如果不使用简单工厂，那么所有的客户类都要知道所有子类的细节。而且一旦子类发生改变，例如增加子类，那么所有的客户类都要进行修改。
       
 工厂方法（Factory Method）
    目标：
        定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类。
    实现：
        在简单工厂中，创建对象的是另一个类，而在工厂方法中，是由子类来创建对象。
    应用：
     JDK
        java.util.Calendar
        java.util.ResourceBundle
        java.text.NumberFormat
        java.nio.charset.Charset
        java.net.URLStreamHandlerFactory
        java.util.EnumSet
        javax.xml.bind.JAXBContext


 抽象工厂（Abstract Factory）
    目标：
        提供一个接口，用于创建 相关的对象家族。
    实现：
        抽象工厂模式创建的是对象家族，也就是很多对象而不是一个对象，并且这些对象是相关的，也就是说必须一起创建出来。
        而工厂方法模式只是用于创建一个对象，这和抽象工厂模式有很大不同。
        抽象工厂模式用到了工厂方法模式来创建单一对象，AbstractFactory 中的 createProductA() 和 createProductB() 方法都是让子类来实现，这两个方法单独来看就是在创建一个对象，这符合工厂方法模式的定义。
        至于创建对象的家族这一概念是在 Client 体现，Client 要通过 AbstractFactory 同时调用两个方法来创建出两个对象，在这里这两个对象就有很大的相关性，Client 需要同时创建出这两个对象。
        从高层次来看，抽象工厂使用了组合，即 Client 组合了 AbstractFactory，而工厂方法模式使用了继承。
    应用：
        JDK
        javax.xml.parsers.DocumentBuilderFactory
        javax.xml.transform.TransformerFactory
        javax.xml.xpath.XPathFactory