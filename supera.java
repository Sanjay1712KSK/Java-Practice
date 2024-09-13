class ani{
    void eat(){
        System.out.println("hehehehehe");
    }
}
class rudh extends ani{
    void mv3(){
        System.out.println("HitOhit uh!!");
    }
    void work(){
    super.eat();
}}
public class supera {
    public static void main(String[] main){
        ani a=new ani();
        rudh r=new rudh();
        a.eat();
        r.mv3();
        r.work();
    }
}
