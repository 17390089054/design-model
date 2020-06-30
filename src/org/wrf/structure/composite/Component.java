package org.wrf.structure.composite;

/**
 * @program: design_model
 * @description: 组件类
 * @author: Wang.Rongfu
 * @create: 2020-06-26 22:18
 **/
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public void print() {
        print(0);
    }

    abstract void print(int level);

    abstract public void add(Component component);

    abstract public void remove(Component component);
}
