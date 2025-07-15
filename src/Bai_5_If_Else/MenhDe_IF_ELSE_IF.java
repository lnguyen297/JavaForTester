package Bai_5_If_Else;

public class MenhDe_IF_ELSE_IF {
    public static void main(String[] args) {
        int mark = 65;

        if(mark < 50){
            System.out.println("Tach");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("Xep loai D");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("Xep loai C");
        } else if (mark >=70 && mark < 80) {
            System.out.println("Xep loai B");
        } else if (mark >=80 && mark < 90) {
            System.out.println("Xep loai A");
        } else if (mark >= 90) {
            System.out.println("Xep loai A+");
        } else {
            System.out.println("Gia tri nhap vao khong hop le");
        }
    }
}
