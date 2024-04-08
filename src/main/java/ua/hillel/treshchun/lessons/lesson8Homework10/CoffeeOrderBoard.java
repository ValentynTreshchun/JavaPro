package ua.hillel.treshchun.lessons.lesson8Homework10;

import java.util.NavigableSet;
import java.util.TreeSet;

public class CoffeeOrderBoard {

    NavigableSet<Order> orderQueue = new TreeSet<>();

    public void add(String name) {
        Order order = new Order(name);
        order.setOrderNumber(orderQueue.isEmpty() ? 1 : orderQueue.first().getOrderNumber() + 1);
        orderQueue.add(order);
    }

    public void add(Order order) {
        if (order.getOrderNumber() == null) {
            order.setOrderNumber(orderQueue.size() + 1);
            orderQueue.add(order);
        } else {
            orderQueue.add(order);
        }
    }

    public boolean deliver() {
        if (!orderQueue.isEmpty()) {
            System.out.println("Order number " + orderQueue.last().getOrderNumber()
                    + " for customer " + orderQueue.last().getCustomerName() + " is ready. Have a nice day!");
            orderQueue.remove(orderQueue.last());
            return true;
        } else {
            System.out.println("Order queue is empty");
            return false;
        }
    }

    public boolean deliver(int orderNumber) {
        if (!orderQueue.isEmpty()) {
            Order temp = new Order("temp", orderNumber);
            Order result = orderQueue.ceiling(temp) == orderQueue.floor(temp) ? orderQueue.ceiling(temp) : null;
            if (result != null) {
                System.out.println("Order number " + result.getOrderNumber()
                        + " for customer \"" + result.getCustomerName()
                        + "\" is ready for pickup. Have a nice day!");
                orderQueue.remove(result);
                return true;
            } else {
                System.out.println("Order number " + orderNumber + " not found");
                return false;
            }
        } else {
            System.out.println("Order queue is empty, nothing to deliver");
            return false;
        }
    }

    public void draw() {
        System.out.println("Order number | Name");
        orderQueue.descendingSet().forEach(order -> System.out.println(order.getOrderNumber() +
                " | " + order.getCustomerName()));
    }
}
