package Bai11_Class_Object;

public class DemoClassObject {
    String name;
    int age;
    String address;
    String phone;

    public void displayInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(phone);
    }

    public static void main(String[] args) {
        DemoClassObject student = new DemoClassObject();
        student.displayInfo();
    }
}



