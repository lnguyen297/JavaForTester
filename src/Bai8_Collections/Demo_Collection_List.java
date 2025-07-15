package Bai8_Collections;

import java.util.ArrayList;
import java.util.List;

public class Demo_Collection_List {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(12);
        listNumber.add(14);
        listNumber.add(42);
        listNumber.add(52);

        // Truy xuat dong loat khong thong qua vi tri
        System.out.println("======Truy xuat dong loat======");
        for (int value : listNumber){
            System.out.println(value);
        }
        // Truy xuat thong qua vi tri cu the
        System.out.println("======Truy xuat thong qua vi tri======");
        System.out.println(listNumber.get(2));
    }
}
