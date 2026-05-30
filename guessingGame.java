import java.util.Random;
import java.util.Scanner;
class guessGame{
    private int comp_num;
    private int user_num;
    private int chances;
    guessGame(){
        System.out.println("Welcome to umber guessing game. Hope you enjoy....");
        Random r = new Random();
        comp_num = r.nextInt(100);
        chances = 0;
    }
    void userInput(int x){
        user_num = x;
    }
    void game(){
        if (user_num > comp_num){
            System.out.println("the guessed number is greater than the choosen number. ");
            chances++;
        }
        else if (user_num < comp_num){
            System.out.println("the guessed number is smaller than the choosen number. ");
            chances++;
        }
        else {
            System.out.println("CONGRATS! you got it right.");
            chances++;
            System.out.println("it took " + chances + " guesses for you to get it right ;)");
        }
    }
}
public class guessingGame{
    public static void main(String[] args){
        guessGame player = new guessGame();
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter your guess: ");
            int n = sc.nextInt();
            player.userInput(n);
            player.game();
        }
    }
}