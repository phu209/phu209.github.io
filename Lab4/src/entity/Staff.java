package entity;

public class Staff extends Emloyee{

    public Staff(String name, Double salary) {
        super(name, salary);
    }

    @Override
    public double caculateIncome() {
        return salary;
    }

    @Override
    public double caculateVAT() {
        return super.caculateVAT();
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary + ", VAT=" + caculateVAT() +
                '}';
    }
}
