import java.util.Scanner;
abstract class sanjay{
    sanjay(){
        System.out.println("You're not welcome!!!!");
    }
    void deju(){
        System.out.println("April fool!!!");
    }
}
class nain extends sanjay{
    nain(){
        super();
    }
    void deju(){
        System.out.println("Sanjay is the King Maker!");
        super.deju();
    }
}
class parent{
    int id;
    int age;
    String name;
    parent(int id,int age,String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }
    void parr(){
        System.out.println("The parent id is "+id);
        System.out.println("The parent age is "+age);
        System.out.println("The parent name is "+name);
    }
    int annualinc;
    int freehrs;
}
class child extends parent{
    int rollno;
    int annualinc;
    int freehrs;
    child(int id,int age,String name,int rollno,int annualinc,int freehrs){
        super(id,age,name);
        this.rollno=rollno;
        super.annualinc=annualinc;
        this.annualinc=annualinc;
        super.freehrs=freehrs;
        this.freehrs=freehrs;
    }
}
class ch extends child{
    ch(int id,int age,String name,int rollno,int annualinc,int freehrs){
        super(id,age,name,rollno,annualinc,freehrs);
    }
    void out(){
        System.out.println("My roll no is "+rollno);
        System.out.println("My parent's anuual income "+super.annualinc);
        System.out.println("My parent's Freehrs "+super.freehrs);
        System.out.println("My Annual income "+annualinc);
        System.out.println("My freehrs is "+freehrs);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner k=new Scanner(System.in);
        int id;
        int age;
        String name;
        int rollno;
        int annualinc;
        int freehrs;
        System.out.println("Enter the parent id ");
        id=k.nextInt();
        k.nextLine();
        System.out.println("Enter the parent age ");
        age=k.nextInt();
        k.nextLine();
        System.out.println("Enter the parent name ");
        name=k.nextLine();
        System.out.println("Enter the student rollno ");
        rollno=k.nextInt();
        System.out.println("Enter the Parents annual Income ");
        annualinc=k.nextInt();
        System.out.println("Enter the student freehrs ");
        freehrs=k.nextInt();
        ch c1=new ch(id,age,name,rollno,annualinc,freehrs);
        c1.parr();
        c1.out();
        nain n=new nain();
        n.deju();
    }
}