package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

public class Student {
    //Không khai báo từ khóa phạm vi truy cập nào thì nó sẽ hiểu là Default
    int age = 30;
    String phone = "123456789";

    protected  String getPhone(){
        return phone;
    }

    public static void main(String[] args) {

    }

    int tuoi = 10;
    public int getTuoi(){
        return tuoi;
    }
}
