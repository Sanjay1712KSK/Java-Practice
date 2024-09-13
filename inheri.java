import java.util.Scanner;
class vijay{
    int a,b;
    void display(){
        System.out.println(a+b);
    }
}
class jason extends vijay{
    int c,d;
    void display(){
        System.out.println((a*b)+(b+c)-(c*d)+(d+c));
    }
}
public class inheri {
    public static void main(String[] args){
        vijay v=new vijay();
        jason j=new jason();
        Scanner e=new Scanner(System.in);
        v.a=e.nextInt();
        v.b=e.nextInt();
        j.c=e.nextInt();
        j.d=e.nextInt();
        v.display();
        j.display();
    }
}
