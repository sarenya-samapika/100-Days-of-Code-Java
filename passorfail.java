import java.util.Scanner;
public class passorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter math marks: ");
        int math = sc.nextInt();
        System.out.println("enter science marks: ");
        int science = sc.nextInt();
        System.out.println("enter english marks: ");
        int english = sc.nextInt();
        int totalpercentage = (math + science + english) / 3 * 100;
        if (math>=33 && science>=33 && english>=33 && totalpercentage>=40){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        }
    }

