package org.wrf.action.chainOfResponsibility;



/**
 * @program: design_model
 * @description: 具体处理器
 * @author: Wang.Rongfu
 * @create: 2020-06-30 22:03
 **/
public class ConcreteHandler1 extends Handler {
    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if(request.getType() == RequestType.TYPE1){
            System.out.println(request.getName()+" is handle by concreteHandler1");
            return;
        }
        if(successor!=null){
            successor.handleRequest(request);
        }
    }

}
