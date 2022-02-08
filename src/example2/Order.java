package example2;

import java.util.Objects;

public class Order {
    private String name;
    private double price;
    private Status status;

    public Order(String name, double price, Status status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.price, price) == 0 && Objects.equals(name, order.name) && status == order.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, status);
    }

    @Override
    public String toString() {
        return name + " (" + price + " zł )" + " - " + status.toString();
    }
}
