class RetailItem
{
    private String desc;
    private int units;
    private double price;

    public double getPrice() {
        return price;
    }

    public int getUnits() {
        return units;
    }
    public void display(int price){
        System.out.println();
    }

    public String getDesc() {
        return desc;
    }



    public RetailItem(String desc, int u, double price) {
        this.desc = desc;
        this.units=u;
        this.price=price;


    }
}
public class Main {
    public static void main(String[] args) {
        RetailItem o1=new RetailItem("this is first object",35,65.9);
        System.out.println(o1.getDesc());
        RetailItem o2=new RetailItem("this is second object",55,386.5);


    }
}