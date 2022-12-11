package Employee;

public class Emp {
    String name,empid, category;
    int bpay;
    double hra,da,npay,pf,grosspay,incometax,allowance;
    public Emp(String name, String empid, String category, int bpay){
        this.name = name;
        this.empid = empid;
        this.category = category;
        this.bpay = bpay;
        this.calculate();
    }
    public void calculate(){
        da = bpay*0.05;
        hra = bpay*0.09;
        pf = bpay*0.11;
        allowance = bpay*0.10;
        grosspay = bpay+da+hra+allowance-pf;
        incometax = 0.75*grosspay;
        npay = grosspay - incometax;
    }
    public void display(){
        System.out.println("Employee Details");
        System.out.println("Name: "+name);
        System.out.println("Empid: "+empid);  
        System.out.println("Category: "+category);      
        System.out.println("bpay: "+bpay);
        System.out.println("da: "+da);
        System.out.println("hra: "+hra);
        System.out.println("pf: "+pf);
        System.out.println("all: "+allowance);
        System.out.println("gs: "+grosspay);
        System.out.println("Incometax: "+incometax);
        System.out.println("npay: "+npay);
    }

}
