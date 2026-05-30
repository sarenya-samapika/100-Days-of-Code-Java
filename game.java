class TommyVecetti{
    public void hitting(){
        System.out.println("hitting...");
    }
    public void fire(){
        System.out.println("firing...");
    }
}
public class game{
    public static void main(String[] args){
        TommyVecetti player_1 = new TommyVecetti();
        player_1.hitting();
        player_1.fire();
    }
}