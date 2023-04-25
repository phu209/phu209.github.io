package entity;

public class MaketingEmloyee extends Emloyee {
    private double sales;
    private double bonus;

    public MaketingEmloyee(String name, Double salary, double sales, double bonus) {
        super(name, salary);
        this.sales = sales;
        this.bonus = bonus;
    }

    @Override
    public double caculateIncome() {
        return salary+(sales*bonus);
    }

    @Override
    public double caculateVAT() {
        return super.caculateVAT();
    }

    @Override
    public String toString() {
        return "MaketingEmloyee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", sales=" + sales +
                ", bonus=" + bonus +
                ", VAT=" + caculateVAT() +
                '}';
    }
}
