package entity;

public class Customers extends Entity<Integer> {
    private int customer_id;
    private String customer_name;
    private String customer_address;
    private int customer_phone;
    private String customer_email;

    public Customers() {
        // Constructor mặc định không tham số
    }

    public Customers(Integer customer_id) {
        super(customer_id);
    }

    public Customers(int customer_id, String customer_name, String customer_address, int customer_phone, String customer_email) {
        super(customer_id);
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public int getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(int customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }
}
