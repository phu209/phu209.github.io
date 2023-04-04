package Bvn;

public class Hinhchunhat extends Hinhhoc{
    private double length;
    private double width;

    public Hinhchunhat() {
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double chuVi() {
        return (length+width)*2;
    }

    @Override
    public double dienTich() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Hình chữ nhật: " +
                "chiều dài: " + length +
                " - chiều rộng: " + width +
                " - chu vi: "+ chuVi() + " - diện tích: "+ dienTich();
    }
}
