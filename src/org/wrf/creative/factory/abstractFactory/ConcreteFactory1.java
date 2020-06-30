package org.wrf.creative.factory.abstractFactory;

/**
 * @program: design_model
 * @description: 子类工厂
 * @author: Wang.Rongfu
 * @create: 2020-06-24 21:59
 **/
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
