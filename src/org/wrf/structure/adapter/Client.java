package org.wrf.structure.adapter;

/**
 * @program: design_model
 * @description: 野鸡学鸭叫
 * @author: Wang.Rongfu
 * @create: 2020-06-26 21:04
 **/
public class Client {
    public static void main(String[] args) {
        Turkey turkey=new WildTurkey();
        Duck duck=new TurkeyAdapter(turkey);
        duck.quack();
    }
}
