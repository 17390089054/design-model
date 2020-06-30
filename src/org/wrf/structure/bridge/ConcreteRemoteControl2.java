package org.wrf.structure.bridge;

/**
 * @program: design_model
 * @description: 遥控器2
 * @author: Wang.Rongfu
 * @create: 2020-06-26 21:20
 **/
public class ConcreteRemoteControl2 extends  RemoteControl {

    public ConcreteRemoteControl2(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("ConcreteRemoteControl2.on()");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("ConcreteRemoteControl2.off()");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("ConcreteRemoteControl2.tuneChannel()");
        tv.tuneChannel();
    }
}
