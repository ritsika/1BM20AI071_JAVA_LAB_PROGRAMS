abstract class shape{
    abstract void display();
}
class Triangle extends shape{

    int b;
    int h;
    Triangle(int b,int h)
    {
        this.b=b;
        this.h=h;
    }
    double area;
    void calcArea()
    {

        area=0.5*b*h;
    }
    void display()
    {

        System.out.println(area);

    }
}
class Circle extends shape{
    int r;
    double area;
    void calcArea()
    {
        area=3.14*r*r;

    }
    void display()
    {
        System.out.println(area);
    }
}

class Hexagon extends shape{
    int s;
    double area;
    void calcArea()
    {
        area = ((3*1.73)/2)*s*s;

    }
    void display()
    {
        System.out.println(area);
    }
}
class circle3d extends Circle
{
    double area;

    @Override
    void calcArea() {
        area=4*3.14*r*r;
    }

    @Override
    void display() {

        System.out.println(area);
    }
}
class demo{
    public static void main(String[] args) {
        Triangle o1=new Triangle(4,7);
        Circle o2= new Circle();
        Hexagon o3=new Hexagon();
        circle3d o4=new circle3d();
        o1.b=5;
        o1.h=4;

        o4.r=9;
        o4.calcArea();
        o4.display();
    }
}