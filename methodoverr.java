class A {
    int a, b;
    A(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void display1() {
        int c = a + b;
        System.out.println(c);
    }
}
class B extends A {
    int d, e;
    B(int a, int b, int d, int e) {
        super(a, b);
        this.d = d;
        this.e = e;
    }
    void display2() {
        int f = d + e;
        System.out.println(f);
    }
}
public class methodoverr {
    public static void main(String[] args) {
        A p = new A(1, 2);
        p.display1();
        B q = new B(1, 2, 3, 6);
        q.display2();
    }
}
