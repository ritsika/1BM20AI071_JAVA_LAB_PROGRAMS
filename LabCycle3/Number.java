import java.lang.Math;

class Number{
    private double x;
    Number(double x){ this.x = x; }

    boolean isPositive() { return this.x > 0; }
    boolean isNegative() { return this.x < 0; }
    boolean isOdd() { return this.x % 2 == 1; }
    boolean isEven() { return this.x % 2 == 0; }
    boolean isPrime() {
        double n = this.x;
        boolean ans = false;
        for(int i = 2 ; i * i <= n ; i++) ans |= (n % i == 0);
        return !ans;
    }
    boolean isArmstrong() {
        double n = this.x;
        int ans = 0;
        while(n > 0){
            double digit = n%10;
            ans += digit * digit * digit;
            n /= 10;
        }
        return ans == this.x;
    }

    double getFactorial() {
        double ans = 1;
        for(int i = 1 ; i <= this.x ; i++) ans *= i;
        return ans;
    }
    double getSqrt() {
        return Math.sqrt(this.x);
    }
    double getSqr() {
        return this.x * this.x;
    }
    double sumDigits() {
        double ans = 0, n = this.x;
        while(n > 0){
            ans += (n%10);
            n /= 10;
        }
        return ans;
    }
    double getReverse(){
        double ans = 0, n = this.x;
        while(n > 0){
            ans = ans * 10 + (n%10);
            n /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Number x = new Number(7);
        System.out.println(x.isPositive());
        System.out.println(x.isNegative());
        System.out.println(x.isOdd());
        System.out.println(x.isEven());
        System.out.println(x.isPrime());
        System.out.println(x.isArmstrong());
        System.out.println(x.getFactorial());
    }
}