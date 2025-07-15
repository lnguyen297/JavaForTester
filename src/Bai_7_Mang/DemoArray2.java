package Bai_7_Mang;

public class DemoArray2 {
    public static void main(String[] args) {
        int number[] = new int[10];

        //Gán giá trị thông qua vòng lặp FOR
        for(int i = 0; i < number.length; i++){
            number[i]= i;
        }
        // Duyệt mảng number bằng vòng lặp FOR cải tiến
        for(int temp: number){
            System.out.println(temp);
        }

        String emailList[] = new String[4];
        //Khai báo và gán giá trị cho mảng trực tiếp (nặc danh)
        String emailData[] = {"admin@example.com", "project@example.com", "client@example.com"};
        System.out.println(emailData[1]);
    }
}
