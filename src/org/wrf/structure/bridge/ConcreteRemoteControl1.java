package org.wrf.structure.bridge;

/**
 * @program: design_model
 * @description: 遥控器1
 * @author: Wang.Rongfu
 * @create: 2020-06-26 21:20
 **/
public class ConcreteRemoteControl1 extends  RemoteControl {

    public ConcreteRemoteControl1(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("ConcreteRemoteControl1.on()");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("ConcreteRemoteControl1.off()");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("ConcreteRemoteControl1.tuneChannel()");
        tv.tuneChannel();
    }
}
