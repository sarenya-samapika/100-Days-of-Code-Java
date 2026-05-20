public class sumtable{
    public static void main(String[] args){
        int sum=0;
        for(int i=1; i<=10; i++){
            int table = 8 * i;
            sum+=table;
        }
        System.out.println(sum);
    }
}