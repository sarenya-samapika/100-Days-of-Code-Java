import java.util.Scanner;
public class sumUsingReccursion{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int Sum = n + sum(n-1);
        return Sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}