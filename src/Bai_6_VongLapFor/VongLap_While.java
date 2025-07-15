package Bai_6_VongLapFor;

public class VongLap_While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i += 1;
        }
        do {
            System.out.println(i);
        }while (i < 10);
    }
}
