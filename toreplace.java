import java.util.Scanner;
public class toreplace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name: ");
        String name= sc.nextLine();
        System.out.printf("Hi %s, thanks a lot!", name);
    }
}