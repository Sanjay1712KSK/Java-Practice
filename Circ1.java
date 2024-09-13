import java.util.Scanner;
//
//class Circ {
//    double x, y;
//    double r;
//
//    double circumfer() {
//        // Correct formula for circumference of a circle
//        return 2 * Math.PI * r;
//    }
//
//    double area() {
//        // Correct formula for area of a circle
//        return Math.PI * r * r;
//    }
//}
//
//class Box {
//    double w, l, b, h;
//
//    double peri() {
//        // Correct formula for the perimeter of a box (surface area)
//        return 2 * (l * b + b * h + h * l);
//    }
//
//    double cubare() {
//        // Correct formula for the surface area of a cuboid
//        return 2 * (l * w + w * h + h * l);
//    }
//}
//
//public class Circ1 {
//    public static void main(String[] args) {
//        Circ c1 = new Circ();
//        Box q2 = new Box();
//        Scanner du = new Scanner(System.in);
//
//        System.out.println("Enter width of the box:");
//        q2.w = du.nextDouble();
//        System.out.println("Enter length of the box:");
//        q2.l = du.nextDouble();
//        System.out.println("Enter breadth of the box:");
//        q2.b = du.nextDouble();
//        System.out.println("Enter height of the box:");
//        q2.h = du.nextDouble();
//        System.out.println("Enter x coordinate of the circle:");
//        c1.x = du.nextDouble();
//        System.out.println("Enter y coordinate of the circle:");
//        c1.y = du.nextDouble();
//        System.out.println("Enter radius of the circle:");
//        c1.r = du.nextDouble();
//
//        System.out.println("Perimeter of box: " + q2.peri());
//        System.out.println("Surface area of box: " + q2.cubare());
//        System.out.println("Circumference of circle: " + c1.circumfer());
//        System.out.println("Area of circle: " + c1.area());
//
//        du.close();
//    }
//}
class c1{
    double x,y;
    double r;
    double circum(){
        return x*y*r;
    }
    double area(){
        return r*2;
    }
    c1(double a,double b,double c){
        x=a;
        y=b;
        r=c;
    }
}
public class Circ1{
    public static void main(String args[]){
        c1 c=new c1(4.32,12.1,0.12);
        c1 cc=new c1(6.0,5.0,8.9);
//        c.setof(4.32,12.1,0.12);
//        cc.setof(6.0,5.0,8.9);
        System.out.println("The circumference of circle 1 is "+ c.circum());
        System.out.println("The circumference of circle 2 is "+ cc.circum());
        System.out.println("The Area of circle 1 is "+ c.area());
        System.out.println("The Area of circle 2 is "+ cc.area());
    }
}
