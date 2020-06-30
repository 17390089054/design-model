package org.wrf.action.chainOfResponsibility;

/**
 * @program: design_model
 * @description: 请求类型
 * @author: Wang.Rongfu
 * @create: 2020-06-30 22:07
 **/
public class Request {

    private RequestType type;
    private String name;


    public Request(RequestType type, String name) {
        this.type = type;
        this.name = name;
    }


    public RequestType getType() {
        return type;
    }


    public String getName() {
        return name;
    }
}