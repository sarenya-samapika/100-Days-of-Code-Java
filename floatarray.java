public class floatarray{
    public static void main(String[] args){
        float[] num= {23f, 45f, 67f, 32f, 9f};
        float sum= 0;
        for(int i=0; i<num.length; i++){
            sum= sum+ num[i];
        }
        System.out.println(sum);
    
    }
}