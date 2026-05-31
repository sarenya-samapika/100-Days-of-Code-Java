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
        height = h;
    }
    int getheight(){
        return height;
    }
    double getSurfacearea(){
        double surfaceArea = 2 * 3.14 * height * radius;
        return surfaceArea;
    }
    double getVolume(){
        double volume = 3.14 * radius * radius * height;
        return volume;
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
        System.out.println("height: " + cy.getheight());
        System.out.println("surface area: " + cy.getSurfacearea());
        System.out.println("volume: " + cy.getVolume());
    }
}