import java.util.Scanner;
public class avgUsingFunction{
    public static int avg(int ...arr){
        int x = arr.length;
        int sum=0;
        for(int i=0; i<x; i++){
            sum += arr[i];
        }
        int average = sum / x;
        return average;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("average of how many numbers? ");
        int x = sc.nextInt();
        int[] array = new int[x];
        System.out.println("enter integers: ");
        for(int i = 0; i<x; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("average = " + avg(array));
    }
}