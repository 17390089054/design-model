package org.wrf.action.chainOfResponsibility;




/**
 * @program: design_model
 * @description: 抽象处理器
 * @author: Wang.Rongfu
 * @create: 2020-06-30 22:01
 **/
public abstract class Handler {
    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    protected abstract void handleRequest(Request request);

}
