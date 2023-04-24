package entity;

public class HouseHold {
    private String name;
    private int address;
    private int soMaCongTo;

    public HouseHold(String name, int address, int soMaCongTo) {
        this.name = name;
        this.address = address;
        this.soMaCongTo = soMaCongTo;
    }

    @Override
    public String toString() {
        return "houseHold{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", soMaCongTo=" + soMaCongTo +
                '}';
    }
}
