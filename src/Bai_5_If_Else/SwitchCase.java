package Bai_5_If_Else;

public class SwitchCase {
    public static void main(String[] args) {
        int number = 20;
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }

        String browser = "edge";
        switch (browser){
            case "chrome":
                System.out.println("Run chrome browser");
                break;
            case "firefox":
                System.out.println("Run firefox browser");
                break;
            case "edge":
                System.out.println("Run edge browser");
                break;
            default:
                System.out.println("Run chorme browser");
        }

        String platform = "windows";
            switch (platform){
                case "windows":
                    System.out.println("Run windows");
                case "macos":
                    System.out.println("Run macos");
                case "linux":
                    System.out.println("Run linux");
                default:
                    System.out.println("Gia tri trinh duyet khong dung");
            }
    }
}
