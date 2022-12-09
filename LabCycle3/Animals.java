abstract class Animals {
    protected int legs;
    protected Animals(int legs) { this.legs = legs; }
    public abstract void eat();
    public void walk(){
        System.out.println("Animal walks with " + legs + " legs");
    }
}

class Spiders extends Animals {
    Spiders(){
        super(8);
    }
    @Override
    public void eat() {
        System.out.println("Spider is eating");
    }
}

interface Pets {
    String getName();
    void setName(String name);
    void play();
}

class Cat extends Animals implements Pets {
    private String name;
    Cat(String name){
        super(4);
        this.name = name;
    }
    Cat(){
        this("");
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println(this.name + " says meow! :3");
    }
    @Override
    public void eat() {
        System.out.println(this.name + " is eating");
    }
}

class Fish extends Animals implements Pets{
    private String name;

    Fish(){
        this("");
    }

    Fish(String name){
        super(0);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Fish " + this.name + " cannot eat");
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(this.name + " is playing.");
    }
    
}

class TestAnimals{
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animals a = new Fish();
        Animals e = new Spiders();
        Pets p = new Cat();

        p.setName("Cookie");
        p.play();

        c.eat();

    }
}