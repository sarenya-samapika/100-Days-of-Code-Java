import java.util.Scanner;
public class findintinarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer to check if in array: ");
        int num= sc.nextInt();
        int[] array={34, 32, 56, 90, 45, 67, 89};
        boolean isInArray = false;
        for(int i =0; i<array.length; i++){
            if(num==array[i]){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("found");

        }
        else{
            System.out.println("not found");
        }
    }
}
