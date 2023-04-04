package BT_QLBenhVien;

public class Doctor extends Person{
    private String specialist;
    private double workTime;
    public Doctor(int id, String name, int age, String address, String specialist, double workTime) {
        super(id, name, age, address);
        this.specialist = specialist;
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "Doctor: "+ super.toString() +"\t Khoa: "+ specialist +"\t Giờ làm việc: "+ workTime;
    }
}
