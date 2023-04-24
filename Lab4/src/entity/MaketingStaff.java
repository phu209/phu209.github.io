package entity;

public class MaketingStaff extends Staff{
    private double sales;
    private double bonus;

    public MaketingStaff(String name, Double salary, double sales, double bonus) {
        super(name, salary);
        this.sales = sales;
        this.bonus = bonus;
    }

    @Override
    public double caculateIncome() {
        return salary;
    }

    @Override
    public double caculateVAT() {
        if (caculateIncome() < 11000000) return 0;
        return 0.1 *(caculateIncome()-11000000);
    }
}
