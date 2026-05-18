import java.util.Random;
import java.util.Scanner;
public class rockpaperscissors{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("0==Rock, 1==Paper, 2==Scissors");
        System.out.println("enter a number: ");
        int user= scanner.nextInt();
        if(user<0 || user>2){
            System.out.println("invalid input");
            return;
        }
        else{
            int computer = random.nextInt(3);
            System.out.printf("by computer: %d\n", computer);
            if ( user==computer){
            System.out.println("draw");
            }
            else if (user==0 && computer==2 || user==1 && computer==0 || user==2 && computer==1){
            System.out.println("YOU WIN!");
            }
            else {
            System.out.println("YOU LOSE!");
            }
        }
    }
}