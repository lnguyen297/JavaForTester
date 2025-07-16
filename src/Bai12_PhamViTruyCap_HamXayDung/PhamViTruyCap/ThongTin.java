package Bai12_PhamViTruyCap_HamXayDung.PhamViTruyCap;

import Bai12_PhamViTruyCap_HamXayDung.HamXayDung.Student;

//Từ khóa extends đại diện cho sự kế thừa class
public class ThongTin extends Student {
    public static void main(String[] args) {
        DemoPrivate demoPrivate = new DemoPrivate();
        System.out.println(demoPrivate.getName());

        Student student = new Student();
        System.out.println(student);

        DemoDefault demodefault = new DemoDefault();
        System.out.println();

        DemoProtected demoProtected = new DemoProtected();
        demoProtected.getAddress();

        ThongTin thongTin = new ThongTin();
        thongTin.getPhone(); // Gọi được phạm vi protected khác package khi kế thừa
        //Nếu bỏ kế thừa ra, thì nó sẽ lỗi không gọi đươc getPhone()

        Student student1 = new Student();
        student1.getTuoi();
    }
}
