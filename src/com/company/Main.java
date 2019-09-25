package com.company;

public class Main {

    public static void main(String[] args) {
        int x = swap(271);
        System.out.print(x);
        timeLeft(1,34,8,20);


    }

    public static int swap(int x) {

        int y = x%10;  //finds the one digit
        int z = x%100;  //finds the last two digits
        z = z/10;  //finds the tens digit
        int a;
        a = x/100;  //finds the hundreds digit
        int b = (a*100 + y*10 + z);  //combines it into another number with the ones and tens digit flipped
        return b;

    }

    public static int timeLeft(int curHour, int curMin, int depHour, int depMin) {
        int s;
        int r;
        int t;
        int d;
        int f;
        t = curHour*60 + curMin;  //shows total minutes of the current time
        s = depHour*60 + depMin;  //shows the total minutes of the departure time
        r = s - t;  //subtracts the two times to show how many total minutes remaining
        d = r/60;   //finds how many hours is remaining
        f = r%60;  //finds how many minutes is remaining
        System.out.print(d + " hours " + f + " minutes left");  //prints out the time remaining
        return 0;

    }

    public static int dayOfWeek(int day, int date){
        

    }
}
