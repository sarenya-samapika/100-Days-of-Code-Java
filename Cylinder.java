import java.util.Scanner;
class cylinder{
    private int radius;
    private int height;
    void setradius(int x){
        radius = x;
    }
    int getradius(){
        return radius;
    }
    void setheight(int h){
        radius = h;
    }
    int getheight(){
        return height;
    }
}
public class shape{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        cylinder cy = new cylinder();
        System.out.print("enter radius: ");
        int r = sc.nextInt();
        cy.setradius(r);
        System.out.print("enter height: ");
        int h = sc.nextInt();
        cy.setheight(h);
        System.out.println("radius: " + cy.getradius());
        System.out.println("radius: " + cy.getheight());
    }
}