import java.util.Scanner;

public class RunMain {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N: ");
        n = sc.nextInt();
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print("_");
            }
            for (int j=0; j<i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
