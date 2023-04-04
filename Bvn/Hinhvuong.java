package Bvn;

public class Hinhvuong extends Hinhhoc{
    private double side;

    public Hinhvuong() {
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double chuVi() {
        return side*4;
    }

    @Override
    public double dienTich() {
        return side*side;
    }

    @Override
    public String toString() {
        return "Hình vuông: " +
                "cạch: " + side +
                " - chu vi: "+ chuVi() + " - diện tích: "+ dienTich();
    }
}
