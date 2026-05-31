class rec{
    private int length;
    private int breadth;
    rec(){
        length = 4;
        breadth = 5;
    }
    void set_length(int x){
        length = x;
    }
    int get_length(){
        return length;
    }
    void set_breadth(int b){
        breadth = b;
    }
    int get_breadth(){
        return breadth;
    }
}
public class shapedimension{
    public static void main(String[] args){
        rec r = new rec();
        int length = r.get_length();
        int breadth = r.get_breadth();
        System.out.println("length : " + length);
        System.out.println("breadth : " + breadth);
    }
}