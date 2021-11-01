package ku.cs.model;

public class Customer extends User{

    private String customerName;
    private String customerTel;
    private String customerEmail;
    private String customerAddress;

    public Customer(String userName, String userPassword, String customerName ,String customerTel, String customerEmail, String customerAddress) {
        super(userName, userPassword);
        this.customerName = customerName;
        this.customerTel = customerTel;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }
}
