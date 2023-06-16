package flighticket;

public class Customer {
    public String name;
    public int gender;
    public int age;
    public boolean elderly;
    public int disabled;

    public Customer(String name, int gender, int age, boolean elderly, int disabled) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.elderly = elderly;
        this.disabled = disabled;
    }
}
