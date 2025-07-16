package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

public class DemoHamXayDung {

    public String name;
    public  int age;

    //Khai báo hàm xây dựng
    public DemoHamXayDung(){
        System.out.println("Tôi nằm trong hàm xây dựng");

        //Khởi tại giá trị
        name = "Nguyen Phi Long";
        age = 23;
    }

    public void showInfo(){
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: "+ age);
    }
    public static void main(String[] args) {
    DemoHamXayDung test = new DemoHamXayDung();
    test.showInfo();
    }
}
