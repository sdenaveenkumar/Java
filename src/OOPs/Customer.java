package OOPs;

public class Customer {
    private String name;
    private int id;
    public String address;
    public String mobile;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Customer(int id, String name, String address, String mobile) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
