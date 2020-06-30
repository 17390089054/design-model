package org.wrf.creative.prototype;

/**
 * @program: design_model
 * @description: 生成原型
 * @author: Wang.Rongfu
 * @create: 2020-06-24 22:24
 **/
public class ConcretePrototype extends Prototype {
    private String filed;

    public ConcretePrototype(String filed) {
        this.filed = filed;
    }


    @Override
    Prototype myClone() {
        return new ConcretePrototype(filed);
    }

    @Override
    public String toString() {
        return filed;
    }
}
