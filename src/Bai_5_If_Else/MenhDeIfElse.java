package Bai_5_If_Else;

public class MenhDeIfElse {
    public static void main(String[] args) {
        String address = "Can Tho";
        String phone = "123456";

        int number = 13;
        if (number % 2 == 0) {
            System.out.println("Số " + number + " là số chẵn.");
        } else {
            System.out.println("Số " + number + " là số lẻ.");
        }

        if (address.equals("Can Tho")) {
            System.out.println("Dia Chi la Can Tho");
        } else {
            System.out.println("Dia chi la tinh khac");
        }

        boolean checkLogin = false;
        if (checkLogin == true) {
            System.out.println("Login Success");
        } else {
            System.out.println("Invalid email or password");
        }

    }
}
