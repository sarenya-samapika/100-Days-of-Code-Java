import java.util.Scanner;
public class patternUsingRecursion{
    public static void pattern(int n){
        if(n==1){
            System.out.println("*");
            return;
        }
        pattern(n-1);
        for(int i=0; i<n; i++){
            System.out.print("* ");
        }
        System.out.println();      
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        pattern(n);
    }
}