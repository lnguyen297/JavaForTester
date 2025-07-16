package Bai11_Class_Object;

import Bai_3_Bien_KieuDuLieu.Student;

public class ThongTin {
    float vat = 10;
    double hocphi = 1500000;

    public double getVat(){
        return vat;
    }
    public double getHocphi(){
        return hocphi;
    }

    public static void main(String[] args) {
        DemoClassObject sv1 = new DemoClassObject();
        sv1.displayInfo();
        // Cách khai báo kiểu Annonymous
        new DemoClassObject().displayInfo();

        ThongTin tt1 = new ThongTin();
        tt1.getHocphi();
        ThongTin tt2 = new ThongTin();
        tt2.getVat();
    }
}
