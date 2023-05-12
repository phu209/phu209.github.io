package view;

public class Menu {
    public void mainMenu() {
        System.out.println("---------------------------------------");
        System.out.println("----------- WELCOME P' PHONE ----------");
        System.out.println("1. Đăng nhập.");
        System.out.println("2. Đăng ký.");
        System.out.println("3. Xem sản phẩm.");
        System.out.println("4. Tìm kiếm sản phẩm.");
        System.out.println("5. Quên mật khẩu.");
        System.out.println("6. Thoát ứng dụng.");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Nhập lựa chọn của bạn:");
    }

    public void login() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------- ĐĂNG NHẬP ----------");
        System.out.println("1. Đăng nhập dưới quyền khách hàng.");
        System.out.println("2. Đăng nhập dưới quyền Admin.");
        System.out.println("0. Quay lại.");
        System.out.println();
        System.out.println("Nhập lựa chọn của bạn:");
    }

    //Customer
    public void loginOk() {
        System.out.println("1. Xem danh sách sản phẩm. ");
        System.out.println("2. Tìm kiếm sản phẩm.");
        System.out.println("3. Quản lý giỏ hàng.");
        System.out.println("4. Lịch sử mua hàng.");
        System.out.println("5. Thông tin cá nhân.");
        System.out.println("6. Đăng xuất.");
        System.out.println();
        System.out.println("Nhập lựa chọn của bạn:");
    }

    public void inforCustomer(){
        System.out.println("1. Thay đổi username.");
        System.out.println("2. Thay đổi email.");
        System.out.println("3. Thay đổi mật khẩu.");
        System.out.println("4. Thay đổi số điện thoại.");
        System.out.println("5. Thay đổi địa chỉ.");
        System.out.println();
        System.out.println("Nhập lựa chọn của bạn:");
    }

    public void loginErrol() {
        System.out.println("1. Đăng nhập lại");
        System.out.println("2. Quên mật khẩu");
        System.out.println();
        System.out.println("Nhập lựa chọn của bạn:");
    }

    public void productView() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------- XEM SẢN PHẨM ----------");
        System.out.println("1. Xem toàn bộ sản phẩm.");
        System.out.println("2. Xem theo hãng.");
        System.out.println("0. Quay lại.");
        System.out.println();
        System.out.println("Nhập lựa chọn của bạn:");
    }

    public void findProduct() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------- TÌM KIẾM SẢN PHẨM ----------");
        System.out.println("1. Tìm theo tên.");
        System.out.println("2. Tìm theo giá sản phẩm.");
        System.out.println("0. Quay lại");
        System.out.println();
        System.out.println("Nhập lựa chọn của bạn:");
    }

    public void viewByBrand(){
        System.out.println("1. Oppo");
        System.out.println("2. Samsung");
        System.out.println("3. Xiaomi");
        System.out.println("4. Realme");
        System.out.println("5. Apple");
        System.out.println("0.Quay lại.");
        System.out.println();
        System.out.println("Nhập lựa chọn của bạn:");
    }

    public void buyProduct() {
        System.out.println("1. Thêm vào giỏ hàng.");
        System.out.println("2. Đến giỏ hàng.");
        System.out.println("0. Quay lại.");
        System.out.println();
        System.out.println("Nhập lựa chọn của bạn:");
    }
}
