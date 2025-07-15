package Bai_7_Mang;

import com.sun.security.jgss.GSSUtil;

public class XuLyMang {
    public static void main(String[] args) {

        //Khai báo và khởi tại độ dài mảng
        String sinhVienArray[] = new String[3];

        //Gán giá trị cho mảng sinhVienArray
        sinhVienArray[0] = "Linh";
        sinhVienArray[1] = "Trường";
        sinhVienArray[2] = "Tươi";

        //Truy xuất giá trị thủ công thông qua vị trí
        System.out.println(sinhVienArray[0]);
        //Duyệt mảng để truy suất đồng loạt
        //Dùng vòng lặp FOR để duyệt mảng

        //Cách 1: DÙng FOR đơn giản
        for (int i = 0; i < sinhVienArray.length; i++){
            System.out.println(sinhVienArray[i]);
        }

        // Cách 2: Dùng FOR cải tiến

        String svArray[] = new String[5];
        //Copy giá trị từ mảng sinhVienArray sang mảng svArray
        for (int i = 0; i < sinhVienArray.length; i++){
            //Gán giá trị tại vị trí của mảng 1 cho mảng 2
            svArray[i] = sinhVienArray[i];
        }

        System.out.println("--------Copy giá trị sang mảng khác-------------");
        for (int i = 0; i < svArray.length; i++){
            System.out.println(svArray[i]);
        }
    }
}
