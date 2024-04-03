package ua.hillel.treshchun.lessons.lesson8Homework10;

public class Order implements Comparable {
    private Integer orderNumber;
    private String customerName;

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public Order(String customerName, int orderNumber) {
        this.customerName = customerName;
        this.orderNumber = orderNumber;
    }

    @Override
    public int compareTo(Object o) {
        if (o.getClass().equals(Order.class)) {
            if (((Order) o).getOrderNumber() < orderNumber)
                return -1;
            else if (((Order) o).getOrderNumber() == orderNumber)
                return 0;
            else return 1;
        } else throw new RuntimeException("Comparing Order to non-Order type object");
    }

    @Override
    public boolean equals(Object obj) {
        return orderNumber.equals(((Order) obj).getOrderNumber())
                && customerName.equals(((Order) obj).getCustomerName());
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
