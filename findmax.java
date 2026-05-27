public class findmax{
    public static void main(String[] args){
        int[] array = {34, 78, 45, 21, 32};
        int max= array[0];
        for (int i=1; i<array.length; i++){ //since index 0 is already taken as maximum so index starts from 1
            if(array[i]>max){
                max= array[i];
                System.out.println(max);
            }
        }
    }
}