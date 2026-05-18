import java.util.Scanner;
public class taxcalculate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        float income = sc.nextFloat();
        if (250000<=income && income<500000){
            float tax = income*0.05f;
            System.out.printf("Your tax is: %.2f " , tax);
        }
        else if (500000<=income && income<1000000){
            float tax = income*0.2f;
            System.out.printf("Your tax is: %.2f " , tax);
        }
        else if (income>=1000000){
            float tax = income*0.3f;
            System.out.printf("Your tax is: %.2f " , tax);
        }
        else{
            System.out.println("You are not liable to pay tax.");
        }

    }
}