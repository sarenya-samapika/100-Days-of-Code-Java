public class sortedarray{
    public static void main(String[] args){
        boolean isSorted = true;
        int[] array = {1, 2, 3, 4, 5};
        for(int i=0; i<array.length-1; i++){//loop till length-1
            if(array[i]>array[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}