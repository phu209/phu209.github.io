package Ql_SinhVien;

public class SvBiz extends SinhVienTechMaster{
    private double marketting;
    private double sales;

    public SvBiz(String name, double marketting, double sales) {
        super(name);
        this.marketting = marketting;
        this.sales = sales;
    }

    @Override
    public double getDiem() {
        return (2*marketting + sales)/3;
    }

    @Override
    public String getHocLuc() {
        return super.getHocLuc();
    }

    @Override
    public void print() {
        System.out.println("Tên: "+name+" - Điểm: "+getDiem()+" - Học lực: "+getHocLuc());
    }
}
