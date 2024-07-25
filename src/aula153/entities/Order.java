package aula153.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import aula153.entities.enums.OrderStatus;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private List<OrderItem> items = new ArrayList<>();

    public Order(){}

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

   public void addItem(OrderItem item) {
    items.add(item);
   }

   public void removeItem(OrderItem item) {
    items.remove(item);
   }

   public Double total(){
    double sum = 0.0;
    for (OrderItem item : items) {
        sum += item.subTotal();
    }
    return sum;
   }

@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Order moment: " + dtf.format(moment) + "\n");
    sb.append("Order status: " + status + "\n");
    sb.append("\n");
    sb.append("Client: " + client.getName() + " (" + dtf.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
    sb.append("\n");
    sb.append("Order items:\n");

    for (OrderItem item : items) {
        sb.append(item.getProduct().getName() + 
        ", $" + 
        String.format("%.2f", item.getPrice()) + 
        ", Quantity: " + 
        item.getQuantity() + 
        ", Subtotal: $" + 
        item.getPrice() + "\n");
    }
    sb.append("\n");
    sb.append("Total price: $" + String.format("%.2f", total()));

    return sb.toString();

}

   

}
