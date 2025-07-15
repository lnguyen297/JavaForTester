package Bai_4;

public class ToanTu_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a + b); //30
        System.out.println(a - b); //-10
        System.out.println(a % 2); //0
        System.out.println(a += b); //30

        System.out.println("Giá trị của a là: " + a);

        System.out.println(a < 5 && b > 0); //sai & đúng => sai
        System.out.println(a < 5 || b > 0); //sai || đúng => đúng
        System.out.println(a < 5 || b > 0 || a == c); // sai & || đúng || đúng => đúng


    }
}
