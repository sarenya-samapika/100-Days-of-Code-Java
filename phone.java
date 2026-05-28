class cellphone{
    public void ringing(){
        System.out.println("Ringing...");
        System.out.println("Vibrating...");
    }
}
public class phone{
    public static void main(String[] args){
        cellphone iphone = new cellphone();
        iphone.ringing();
    }
}