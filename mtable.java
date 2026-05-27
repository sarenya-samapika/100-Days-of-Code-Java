import java.util.Scanner;
public class mtable{
    public static void Table(int a){
        for (int i=1; i<=10; i++){
            int mulTable= a*i;
            System.out.println(mulTable);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int a = sc.nextInt();
        Table(a);
    }
}