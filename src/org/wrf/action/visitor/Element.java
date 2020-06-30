package org.wrf.action.visitor;

/**
 * @program: design_model
 * @description:
 * @author: Wang.Rongfu
 * @create: 2020-06-30 23:34
 **/
public interface Element {
    void accept(Visitor visitor);
}