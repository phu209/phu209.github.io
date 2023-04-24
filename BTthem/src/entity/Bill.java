package entity;
public class Bill {
    private HouseHold houseHolds;
    private int oldNumber;
    private int newNumber;
    private double price;

    public Bill(HouseHold houseHolds, int oldNumber, int newNumber) {
        this.houseHolds = houseHolds;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.price = (newNumber - oldNumber)*750;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "houseHolds=" + houseHolds +
                ", oldNumber=" + oldNumber +
                ", newNumber=" + newNumber +
                ", price=" + price +
                '}';
    }
}
