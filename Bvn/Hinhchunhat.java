package Bvn;

public class Hinhchunhat extends Hinhhoc{
    private double length;
    private double width;

    public Hinhchunhat(double length, double width) {
        this.length = length;
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
