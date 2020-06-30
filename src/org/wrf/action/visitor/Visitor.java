package org.wrf.action.visitor;

/**
 * @program: design_model
 * @description:
 * @author: Wang.Rongfu
 * @create: 2020-06-30 23:36
 **/
public interface Visitor {
    void visit(Customer customer);

    void visit(Order order);

    void visit(Item item);
}
