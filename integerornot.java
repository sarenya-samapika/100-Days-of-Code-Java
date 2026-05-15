import java.util.Scanner;
public class integerornot {
    public static void main(String[] args){ 
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number: ");
        boolean num = sc.hasNextInt();
        System.out.println(num);
    }
}
