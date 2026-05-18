import java.util.Scanner;
public class leapyear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        double year = sc.nextDouble();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.printf("%.0f is a leap year.\n", year);
        } else {
            System.out.printf("%.0f is not a leap year.\n", year);
        }
    }
}