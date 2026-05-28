import java.util.Scanner;
class square{
    int a;
    square(int a){
        this.a = a;
    }
    public int area(){
        int area = a * a;
        return area;
    }
    public int perimeter(){
        int perimeter = 4 * a;
        return perimeter;
    }
}
public class oopssquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a side: ");
        int a = sc.nextInt();
        square sq = new square(a);
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}