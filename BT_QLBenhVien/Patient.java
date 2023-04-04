package BT_QLBenhVien;

public class Patient extends Person{
    private int numberMedical;
    private String date;
    public Patient(int id, String name, int age, String address, int numberMedical, String date) {
        super(id, name, age, address);
        this.numberMedical = numberMedical;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Patient: "+ super.toString() +"\t Số bệnh án: "+ numberMedical +"\t Ngày nhập viện: "+ date ;
    }
}
