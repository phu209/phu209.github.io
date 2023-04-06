package Ql_SinhVien;

public class SvIT extends SinhVienTechMaster{
    private double java;
    private double html;
    private double css;

    public SvIT(String name, double java, double html, double css) {
        super(name);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    @Override
    public double getDiem() {
        return (2*java+html+css)/4;
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
