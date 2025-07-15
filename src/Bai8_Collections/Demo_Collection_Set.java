package Bai8_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo_Collection_Set {
    public static void main(String[] args) {
        // Set - List - Map

        // Khai báo kiểu Set với loại HashSet
        // Không có sắp xếp được
        // Dùng để lưu ID của Driver, sau đó chỉ định Driver chạy automation
        System.out.println("========Hash Set=============");
        Set<String> stringSet = new HashSet<>();
        stringSet.add("KJHGDHGF0984748474");
        stringSet.add("HGDKJFGK2947468468");
        stringSet.add("KJHGDHGF0984748474"); // Hiểu giá trị bị trùng sau cùng
        stringSet.add("HGDHSFDH6573573484");

        System.out.println(stringSet.size());
        System.out.println(stringSet.contains("HGDHSFDH6573573484"));

        for (String value : stringSet) {
            System.out.println(value);
        }
        System.out.println("=====Tree Set=======");
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("124");
        treeSet.add("ABC");
        treeSet.add("BHFHG74635");
        treeSet.add("ABA");
        treeSet.add("123");

        for (String value : treeSet){
            System.out.println(value);

        }

    }
}
