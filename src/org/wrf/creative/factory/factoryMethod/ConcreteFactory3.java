package org.wrf.creative.factory.factoryMethod;

import org.wrf.creative.factory.simpleFactory.ConcreteProduct3;
import org.wrf.creative.factory.simpleFactory.Product;

/**
 * @program: design_model
 * @description: 工厂子类
 * @author: Wang.Rongfu
 * @create: 2020-06-24 21:32
 **/
public class ConcreteFactory3 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct3();
    }
}
