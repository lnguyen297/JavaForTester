package Bai_6_VongLapFor;

public class For_Cai_Tien {
    public static void main(String[] args) {
        int number[] = {5, 7, 20, 10, 9};
        String name[] = {"Hoa", "Linh", "Trường", "Hân"};

        //String sinhVien = Read_File Excel/Json/ Code auto lay ra/ select SQL/ Gọi API

        for(int i : number){
            System.out.println(i);
            if(i == 20){
                System.out.println("Có số 20 tồn tại");
            } else {
                System.out.println("Không có số 30 tồn tại");
            }
        }
        for(String ten : name){
            System.out.println(ten);
            if(ten.equals("Linh")){
                System.out.println("Linh có mặt");
            }
        }
    }
}
