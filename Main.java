import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("science marks: ");
        int science = sc.nextInt();
        System.out.println("math marks: ");
        int math = sc.nextInt();
        System.out.println("sst marks: ");
        int sst = sc.nextInt();
        System.out.println("english marks: ");
        int english = sc.nextInt();
        System.out.println("hindi marks: ");
        int hindi = sc.nextInt();
        int percentage = (science + english + sst + math + hindi)/5;
        System.out.print("percentage: ");
        System.out.print(percentage);
    }
}


