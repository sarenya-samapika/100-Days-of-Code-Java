import java.util.Scanner;
public class fibbonacci{
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibb = fibo(n-1) + fibo(n-2);
        return fibb;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}