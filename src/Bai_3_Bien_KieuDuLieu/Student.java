package Bai_3_Bien_KieuDuLieu;

public class Student {

   public static int a = 20; // Đây là biến toàn cục
    public String ten = "Long";

    public static void sayHello() {
        int b = 10;// Đây là biến cục bộ
        b = b + tinhLaiSuat();
        System.out.println("Gia tri cua n la: " + b);
    }
    public static int tinhLaiSuat(){
        int laiSuat = 1000000;
        return laiSuat;
    }

    public static void main(String[] args) {
        String name = "Nguyen Phi Long";
        int c = 15;
        String get_Account_Customer = "admin@example,com";

        System.out.println(name);
        System.out.println(c);
        System.out.println(get_Account_Customer);
        System.out.println(a);
        Student student = new Student();
        System.out.println(student.ten);
    }


}
