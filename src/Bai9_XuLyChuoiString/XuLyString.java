package Bai9_XuLyChuoiString;

import java.sql.SQLOutput;

public class XuLyString {
    public static void main(String[] args) {

        //Lưu ý: Chuỗi tính từ vị trí ký tự bắt đầu từ 0
        String str1 = "Anh Tester chia sẻ kiến thức Tester, khóa học Testing miễn phí về Automstion Testing";
        String str2 = "và Manual Testing";

        //Cắt chuỗi: dùng hàm substring
        System.out.println("Cắt chuỗi dạng 1: " + str1.substring(11));
        System.out.println("Cắt chuỗi dạng 2: " + str1.substring(11, 35));

        //Ghép chuỗi: dùng dấu + hoặc hàm concat
        System.out.println("Nối Chuỗi: " + str1 + " " + str2);
        System.out.println("Nối Chuỗi: " + str1.concat(" " + str2));
        System.out.println("Nối Chuỗi: " + str1.concat(" ").concat(str2));

        //Độ dài chuỗi
        System.out.println(str1.length());

        //Tách chuỗi dùng hàm split
        System.out.println("Tách chuỗi: " + str1.split(",")[0]); //Lấy giá trị đầu tiên sau khi tách chuỗi
        System.out.println("Tách chuỗi: " + str1.split(",")[1]); //Lấy giá trị thứ 2 sau khi tách chuỗi
        //Loại bỏ khoảng trắng 2 đầu
        System.out.println("Tách chuỗi: " + str1.split(",")[1].trim());

        String str3 = "API Testing With Postman";
        String str4 = "API Testing With Postman Tools";
        String str5 = "api testing with postman";

        System.out.println("So sánh chứa: " + str3.contains("Postman"));
        System.out.println("So sánh chứa: " + str3.contains("Selenium"));
        System.out.println("So sánh chứa: " + str3.contains("Testing"));

        //So sánh bằng
        System.out.println("So sánh bằng: " + str3.equals(str4));
        System.out.println("So sánh bằng: " + str3.equals("API Testing With Postman"));
        System.out.println("So sánh bằng: " + str3.equals(str5));
        System.out.println("So sánh bằng: " + str3.equalsIgnoreCase(str5)); //Bỏ qua phân biệt hoa thường

        //Kiểm tra giá trị bắt đầu và kết thúc của một chuỗi
        System.out.println("Bắt đầu: " + str3.startsWith("API"));
        System.out.println("Bắt đầu: " + str3.endsWith("Postman"));

        //Kiểm tra giá trị rỗng
        String name = "  ";
        System.out.println("Không xem space là chuỗi rỗng: " + name.isEmpty());
        System.out.println("Xem space là chuỗi rỗng: " + name.isBlank());
    }
}
