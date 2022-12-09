abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {
    private int a,b,c;
    A(int a, int b, int c){
        this.a = a; this.b = b; this.c = c;
    }
    @Override
    public double getPercentage() {
        return (this.a + this.b + this.c) / 3.0;
    }
}

class B extends Marks {
    private int a,b,c,d;
    B(int a, int b, int c, int d){
        this.a = a; this.b = b; this.c = c; this.d = d;
    }
    @Override
    public double getPercentage() {
        return (this.a + this.b + this.c + this.d) / 4.0;
    }
}

class Demo{
    public static void main(String[] args) {
        Marks a = new A(80, 40, 50);
        Marks b = new B(60, 70, 80, 90);
        System.out.println("A impl = " + a.getPercentage());
        System.out.println("B impl = " + b.getPercentage());
    }
}