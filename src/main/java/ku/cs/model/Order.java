package ku.cs.model;

import java.util.ArrayList;

public class Order {

    private String orderID;
    private Product product;
    private ArrayList<Product> wishList;
    private double quantity;
    private double totalPrice;
    private Customer customer;
    private String checkoutStatus;
    private String productionStatus;
    private String orderStatus;
}
