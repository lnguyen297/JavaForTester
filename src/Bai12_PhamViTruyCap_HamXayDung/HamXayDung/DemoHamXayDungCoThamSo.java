package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

public class DemoHamXayDungCoThamSo {


    public String name;
    public int age;
    public String address;

    public DemoHamXayDungCoThamSo(String name, int age){
        System.out.println("Đây là hàm xây dựng 2 tham số");

        //KHởi tạo giá trị
        this.name = name;
        this.age = age;
    }


    public DemoHamXayDungCoThamSo(String name, int age, String address){
        System.out.println("Đây là hàm xây dựng 3 tham số");
        //KHởi tạo giá trị
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        //System.out.println("Address: " + address);
    }

    public static void main(String[] args) {

        DemoHamXayDungCoThamSo demoHamXayDungCoThamSo = new DemoHamXayDungCoThamSo("Đạt", 30);
        demoHamXayDungCoThamSo.showInfo();
        DemoHamXayDungCoThamSo demoHamXayDungCoThamSo2 = new DemoHamXayDungCoThamSo("Long", 23, "Lâm Đồng");
        demoHamXayDungCoThamSo2.showInfo();
    }

}
