package entity;
public class Manager extends Emloyee {
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
        return super.caculateVAT();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", salaryPlus=" + salaryPlus +
                ", VAT=" + caculateVAT() +
                '}';
    }
}
