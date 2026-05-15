import java.util.Scanner;
public class day2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number 1: ");
        int num1= sc.nextInt();
        System.out.println("enter number 2: ");
        int num2= sc.nextInt();
        System.out.println("enter number 3: ");
        int num3= sc.nextInt();
        int sum= num1+ num2 + num3;
        System.out.println(sum);
    }
}
