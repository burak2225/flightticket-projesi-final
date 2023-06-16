package flighticket;

public class Airplane {
    public String model;
    public String serialNum;
    public String maintDate;
    public int capacity;

    public Airplane(String model, String serialNum, String maintDate, int capacity) {
        this.model = model;
        this.serialNum = serialNum;
        this.maintDate = maintDate;
        this.capacity = capacity;
    }
}
