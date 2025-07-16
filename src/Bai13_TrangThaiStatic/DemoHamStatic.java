package Bai13_TrangThaiStatic;

public class DemoHamStatic {

    public String name;
    public int age;
    public static String className = "Đại học Bách Khoa Hà Nội";

    public static void getInfo(){
        System.out.println(className); //Biến static

        DemoBienStatic test = new DemoBienStatic();
      //  test.name; //Biến thông thường
    }
}
