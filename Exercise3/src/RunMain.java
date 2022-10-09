import java.util.Scanner;

public class RunMain {
        private static int gcd;
        public static void main(String[] args) {
            int x;
            int y;

            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Input x: ");
                x = sc.nextInt();
            }while (!(x>0));
            do{
                System.out.println("Input y: ");
                y = sc.nextInt();
            }while (!(y>0));
            System.out.printf("UCLN: "+greatCommonDivisor(x,y));

        }
        public static int greatCommonDivisor(int x,int y){
            for(int i=1;i<=x&&y<=y;i++)
                if(x%i==0 && y%i==0)
                    gcd = i;
            return gcd;
        }

}
