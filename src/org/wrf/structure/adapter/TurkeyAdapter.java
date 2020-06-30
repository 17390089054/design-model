package org.wrf.structure.adapter;

/**
 * @program: design_model
 * @description: 火鸡适配器
 * @author: Wang.Rongfu
 * @create: 2020-06-26 21:01
 **/
public class TurkeyAdapter implements Duck{

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey=turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();;
    }
}
