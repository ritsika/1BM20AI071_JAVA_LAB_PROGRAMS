class Shape {
    protected String name;
    Shape(){
        this.name = "";
    }
    String getName() { return this.name; }
}

interface Area {
    double getArea();
}

interface Volume {
    double getVolume();
}

class Circle extends Shape implements Area{
    protected double r;
    Circle(double r, String name) {
        this.r = r;
        this.name = name;
    }   
    @Override
    public double getArea() {
        return 3.14 * r * r;
    }
}

class Square extends Shape implements Area{
    protected double a;
    Square(double a, String name) {
        this.a = a;
        this.name = name;
    }   
    @Override
    public double getArea() {
        return a * a;
    }
}

class Cylinder extends Circle implements Volume {
    private double h;
    Cylinder(double r, String name, double h) {
        super(r, name);
        this.h = h;
    }

    @Override
    public double getVolume() {
        return this.getArea() * h;
    }
    
}

class Sphere extends Circle implements Volume {
    Sphere(double r, String name) {
        super(r, name);
        // this.h = h;
    }

    @Override
    public double getVolume() {
        return 4.0/3.0 * 3.14 * r * r * r;
    }
    
}


class Cube extends Square implements Volume {

    Cube(double a, String name) {
        super(a, name);
    }

    @Override
    public double getVolume() {
        return a * a * a;
    }
    
}

class Glome extends Sphere {

    Glome(double r, String name) {
        super(r, name);
    }
    
}

class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(1, "circle1");
        Square square = new Square(2, "square1");
        Cylinder cylinder = new Cylinder(3, "cylinder1", 4);
        Sphere sphere = new Sphere(5, "sphere1");
        Cube cube = new Cube(6, "cube1");
        Sphere glome = new Glome(7, "glome1");

        System.out.println(circle.getName() + " area is " + circle.getArea());
        System.out.println(square.getName() + " area is " + square.getArea());
        System.out.println(cylinder.getName() + " volume is " + cylinder.getVolume());
        System.out.println(sphere.getName() + " volume is " + sphere.getVolume());
        System.out.println(cube.getName() + " volume is " + cube.getVolume());
        System.out.println(glome.getName() + " volume is " + glome.getVolume());

    }
}