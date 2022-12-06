class Car{
    int model;
    String make;
    public int speed;


    public Car(int model,String make,int speed)
    {
        this.model=model;
        this.make=make;
        this.speed=speed;
    }

    public int getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return this.speed;
    }
    public int accelerate()
    {
        this.speed=this.speed+5;
        return(this.speed);
    }
    public int brake(int speed)
    {
        return(speed-5);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1=new Car(10,"hyundai",87);


        System.out.println(c1.getSpeed());
        c1.accelerate();
        System.out.println(c1.getSpeed());
        c1.accelerate();
        System.out.println(c1.getSpeed());
        c1.accelerate();
        System.out.println(c1.getSpeed());
    }
}