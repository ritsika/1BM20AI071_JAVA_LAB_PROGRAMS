

// Inheritence type is hybrid
class A{
    private
    int a, b;

    protected
    float p, q;

    public
    int x, y;

    A(){
        x = y = a = b = 1;
        p = q = 1.1f;
    }

    void sum(){
        int sum = this.x + this.y;
        System.out.println("Class A, sum = " + sum);
    }

}

class B extends A {
    // i) using super
    void usingSuper(){
        System.out.println("---- IN CLASS B ------");
        super.sum();
        System.out.println("---- EXITING CLASS B ------");
    }
    B(){
        x = y = 2;
    }
    // ii) function overriding
    @Override
    void sum() {
        int sum = this.x + this.y;
        System.out.println("Class B, sum = " + sum);
    }
}

class C extends B {
    // iii) default constructor
    C(){
        x = y = 3;
    }
    @Override
    void sum() {
        int sum = this.x + this.y;
        System.out.println("Class C, sum = " + sum);
    }
    // v) prevents function from being overriden
    static void xyz(){
        System.out.println("Can't override this.");
    }
}

// v) prevents class from being inherited further
final class D extends B {
    // iv) parametrized constructor
    D(int u, int v){
        x = u; 
        y = v;
    }
    @Override
    void sum() {
        int sum = this.x + this.y;
        System.out.println("Class C, sum = " + sum);
    }
}

public class code {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D(4, 4);
        a.sum();
        b.usingSuper();
        b.sum();
        c.sum();
        d.sum();
    }
}
