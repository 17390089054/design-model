package org.wrf.action.nullMode;

/**
 * @program: design_model
 * @description:
 * @author: Wang.Rongfu
 * @create: 2020-06-30 23:41
 **/
public class NullOperation extends AbstractOperation{
    @Override
    void request() {
        System.out.println("null operation");
    }
}