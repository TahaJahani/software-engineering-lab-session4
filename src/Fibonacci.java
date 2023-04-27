import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        System.out.println(fibDp(n));
        //System.out.println(fibRec(n));

    }

    public static long fibRec(int n){
        if (n == 1 || n == 0){
            return 1;
        }else{
            return fibRec(n-1) + fibRec(n-2);
        }
    }

    public static long fibDp(int n){
        long res = 1;
        long tmp1 = 1;
        for (int i = 1; i < n; i++){
            long tmp2 = res;
            res += tmp1;
            tmp1 = tmp2;
        }

        return res;
    }
}
