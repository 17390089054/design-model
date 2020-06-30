package org.wrf.action.strategy;

/**
 * @program: design_model
 * @description:
 * @author: Wang.Rongfu
 * @create: 2020-06-30 23:28
 **/
public class Client {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setQuackBehavior(new Squeak());
        duck.performQuack();
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
    }
}
