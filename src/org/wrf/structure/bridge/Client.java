package org.wrf.structure.bridge;

/**
 * @program: design_model
 * @description: 客户端
 * @author: Wang.Rongfu
 * @create: 2020-06-26 21:22
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteRemoteControl1 remoteControl1=new ConcreteRemoteControl1(new RCA());
        remoteControl1.on();
        remoteControl1.tuneChannel();
        remoteControl1.off();

        ConcreteRemoteControl2 remoteControl2=new ConcreteRemoteControl2(new Sony());
        remoteControl2.on();
        remoteControl2.tuneChannel();
        remoteControl2.off();

    }
}
