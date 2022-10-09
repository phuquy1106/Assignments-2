import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int thang, nam;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao thang: ");
        thang = sc.nextInt();

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;
            case 2:
                    System.out.println("Có 29 ngày hoặc 28 ngày");
                    break;
            default:
                System.out.println("Nhập dữ liệu sai!");
                break;
        }
    }
}
