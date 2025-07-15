package Bai9_XuLyChuoiString;

import java.util.Locale;

public class DemoString {
    public static void main(String[] args) {
        //Khai báo biến dạng chuỗi
        String name = "Anh Tester";

        //Một hằng chuỗi chỉ đơn giản là một chuỗi trực tiếp
        //được đặt trong dấu ngoặc kép, không cần thông qua một biến để lưu trữ
        //"Automation Test" là hằng chuỗi
        System.out.println("Automation Test".toUpperCase());


        String name1 = "Anh Tester";
        System.out.println("Automation Test".toUpperCase());

        //Được phép sử dụng các hàm xử lý trong lớp String để biến tấu giá trị chuỗi theo ý của mình:
        //Cắt, ghép, tách, in hoa, in thường, tìm kiếm vị trí,...
        String str1 = "Automation Test".replace(" ", "-");
        System.out.println(str1);

        //Nối chuỗi
        //Dùng dấu + để ghép chuỗi lại với nhau
        String fullName = "Họ và tên: " + name;
        System.out.println(fullName);
    }
}
