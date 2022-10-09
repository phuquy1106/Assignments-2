public class RunMain {
    public static void main(String[] args) {
        for (int i = 2;i<=9;i++)
        {
            System.out.println("Bảng cửu chương "+i+": ");
            for (int j = 1;j<=10;j++)
            {

                System.out.printf(i+" x "+j+ " = "+(i*j)+"\n");
            }
        }
    }
}
