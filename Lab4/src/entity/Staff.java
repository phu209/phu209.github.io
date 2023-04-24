package entity;

public abstract class Staff{
    protected static int autoId;
    protected int id;
    protected String name;
    protected Double salary;

    public Staff(String name, Double salary) {
        this.id = ++autoId;
        this.name = name;
        this.salary = salary;
    }

    public abstract double caculateIncome();
    public abstract double caculateVAT();

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
