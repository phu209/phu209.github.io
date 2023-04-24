package entity;
public class Manager extends Staff{
    private double salaryPlus;

    public Manager(String name, Double salary, double salaryPlus) {
        super(name, salary);
        this.salaryPlus = salaryPlus;
    }

    @Override
    public double caculateIncome() {
        return salary + salaryPlus;
    }

    @Override
    public double caculateVAT() {
        if (caculateIncome() < 11000000) return 0;
        return 0.1 *(caculateIncome()-11000000);
    }
}
