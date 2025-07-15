package Bai10_ThuocTinh_PhuongThuc;

import java.util.ArrayList;

public class Demo_PhuongThuc {

    int number = 20;

    public void KiemTraSoChan() {
        if (number % 2 == 0) {
            System.out.println("Là số chẵn");
        } else {
            System.out.println("Là số lẻ");
        }
    }

    public ArrayList<Integer> timSoChan(int number){
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= number; i++){
            if(i % 2 == 0){
                arrayList.add(i);
            }
        }
        return arrayList; // Trả về 1 arrayList những giá trị số chẵn

    }

    //Khai báo hàm không trả về giá trị
    public void displayInfo() {
        System.out.println("Hello Student");
        System.out.println("Địa chỉ của tôi ở: " + getAddress());
    }

    //Khai báo hàm có trả về giá trị loại String
    public String getAddress() {
        return "HCM";
    }

    public static String getName() {
        return "Linh";
    }

    public static float chieuDai() {
        return 13.5F;
    }

    public static int chieuRong() {
        return 10;
    }

    public static float tinhDienTich() {
        return chieuDai() * chieuRong();
    }

    public static float tinhChuVi() {
        return (chieuRong() + chieuDai()) * 2;
    }

    public static void main(String[] args) {
        //Cách gọi lại để sử dụng phương thức
        Demo_PhuongThuc demo = new Demo_PhuongThuc();
        demo.displayInfo();//Vì hàm này không có từ khóa static, nên cần thông qua đối tượng class
        System.out.println(getName()); //Vì hàm này có từ khóa static
        System.out.println(tinhDienTich());
        System.out.println(tinhChuVi());
        demo.KiemTraSoChan();

       //In ta giá trị số chẵn từ arrayList trong hàm timSoChan
        for(int soChan : demo.timSoChan(50)){
            System.out.print(soChan + ", ");
        }
    }
}
