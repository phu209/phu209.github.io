package entity;
public abstract class Emloyee {
    protected static int autoId;
    protected int id;
    protected String name;
    protected Double salary;

    public Emloyee(String name, Double salary) {
        this.id = ++autoId;
        this.name = name;
        this.salary = salary;
    }

    public abstract double caculateIncome();
    public double caculateVAT() {
        if (caculateIncome() < 11000000) return 0;
        return 0.1 *(caculateIncome()-11000000);
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }
}
