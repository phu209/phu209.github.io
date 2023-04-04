package BT_QLBenhVien;

public class ManageHospital {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor(1,"Bác Sĩ 1",45,"Hà Nội", "Cấp cứu",16);
        Doctor doctor2 = new Doctor(2,"Bác Sĩ 2",50,"Hải Dương", "Nhi",15);
        System.out.println(doctor1);
        System.out.println(doctor2);
        System.out.println();
        Patient patient1 = new Patient(1, "Nguyễn Văn 1",20,"Hà Nội",3,"4/3/2023");
        Patient patient2 = new Patient(2, "Nguyễn Văn 2",32,"Bắc Ninh",2,"1/3/2023");
        Patient patient3 = new Patient(3, "Nguyễn Văn 3",40,"Hải Phòng",4,"4/2/2023");
        System.out.println(patient1);
        System.out.println(patient2);
        System.out.println(patient3);
    }
}
