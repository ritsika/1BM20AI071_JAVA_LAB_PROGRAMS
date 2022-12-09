
class Clock {
    private int h, m, s;

    Clock(){
        this.h = 12;
        this.m = 0;
        this.s = 0;
    }

    Clock(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    Clock(int s){
        this.h = s / (60 * 60);
        this.m = (s - this.h * 60 * 60) / 60;
        this.s = s - this.h * 60 * 60 - this.m * 60;
    }

    int inSeconds(){
        return this.h * 60 * 60 + this.m * 60 + this.s;
    }
    void setClock(int s){
        this.h = s / (60 * 60);
        this.m = (s - this.h * 60 * 60) / 60;
        this.s = s - this.h * 60 * 60 - this.m * 60;
    }

    int getHours() { return this.h; }
    int getMinutes() { return this.m; }
    int getSeconds() { return this.s; }

    void setHours(int x) { this.h = x; }
    void setMinutes(int x) { this.m = x; }
    void setSeconds(int x) { this.s = x; }

    void tick(){
        this.s++;
        if(this.s == 60){
            this.s = 0;
            this.m++;
            if(this.m == 60){
                this.m = 0;
                this.h++;
                if(this.h == 12){
                    this.h = 0;
                }
            }
        }
    }

    void addClock(Clock c){
        this.setClock(c.inSeconds() + this.inSeconds());
    }

    @Override
    public String toString(){
        return this.h + ":" + this.m + ":" + this.s;
    }

    void tickDown(){
        this.s--;
        if(this.s == -1){
            this.s = 59;
            this.m--;
            if(this.m == 0){
                this.m = 59;
                this.h--;
                if(this.h == -1){
                    this.h = 0;
                }
            }
        }
    }

    Clock subClock(Clock c){
        int diff = Math.abs(c.inSeconds() - this.inSeconds());
        return new Clock(diff);
    }

}


class ClockDemo{
    public static void main(String[] args) {
        Clock clock = new Clock(8274);
        System.out.println("Clock1: " + clock.toString());
        for(int i = 0 ; i < 10 ; i++) clock.tick();
        System.out.println("Clock1: " + clock.toString());
        Clock clock2 = new Clock(3, 14, 23);
        for(int i = 0 ; i < 10 ; i++){
            clock2.tick();
            System.out.println("Clock2: " + clock2.toString());
        }
        clock.addClock(clock2);
        System.out.println("Clock1: " + clock.toString());
        System.out.println("Clock2: " + clock2.toString());
        Clock clock3 = clock.subClock(clock2);
        System.out.println("Clock3: " + clock3.toString());
    }
}
