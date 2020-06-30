package org.wrf.action.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design_model
 * @description:
 * @author: Wang.Rongfu
 * @create: 2020-06-30 23:35
 **/
public class Order implements Element {

    private String name;
    private List<Item> items = new ArrayList();

    Order(String name) {
        this.name = name;
    }

    Order(String name, String itemName) {
        this.name = name;
        this.addItem(new Item(itemName));
    }

    String getName() {
        return name;
    }

    void addItem(Item item) {
        items.add(item);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Item item : items) {
            item.accept(visitor);
        }
    }
}
