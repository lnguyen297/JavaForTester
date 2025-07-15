package Bai10_ThuocTinh_PhuongThuc;

public class DemoHamThamSo {

    //Khai báo hàm có 2 tham số với kiểu dữ liệu tương ứng
    public static int tong2SoNguyen(int number1, int number2) {
        return number1 + number2;
    }

    public static void showInformation(String name, int age, String address) {
        System.out.println("Họ và Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
    }

    public static float tinhDienTich(float chieuDai, float chieuRong) {
        return chieuDai * chieuRong;
    }

    public static void main(String[] args) {
        // tong2SoNguyen();
        System.out.println("Tổng 2 số nguyên là: " + tong2SoNguyen(100, 200));

        //Show Information
        showInformation("Nguyen Phi Long", 23, "Lâm Đồng");
        showInformation("Nguyen Phi Long", 22, "Bình Thuận");

        //Tinh diện tích
        System.out.println("Diện tích là: " + tinhDienTich(10.5f, 5.5f));
    }
}
