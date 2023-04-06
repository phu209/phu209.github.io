package Ql_SinhVien;

public class SinhVienTechMaster extends Point{
    protected String name;
    private String major;
    private double point;

    public SinhVienTechMaster(String name) {
        this.name = name;
    }

    public SinhVienTechMaster(String name, String major, double point) {
        this.name = name;
        this.major = major;
        this.point = point;
    }

    @Override
    public double getDiem() {
        return point;
    }

    @Override
    public String getHocLuc() {
        if (getDiem() <= 5)
            return "Yếu";
        else if (getDiem()<6.5)
            return "Trung Bình";
        else if (getDiem()<7.5)
            return "Khá";
        else if (getDiem()<=10)
            return "Giỏi";
        else
            return "Không có kết quả";
    }

    @Override
    public void print() {
        System.out.println("Tên: "+name+" - Ngành học: "+major+" - Điểm: "+getDiem()+" - Học lực: "+getHocLuc());
    }

}
