package com.company;

public class Main {

    public static void main(String[] args) {
        int x = swap(271);
        System.out.print(x);

    }

    public static int swap(int x) {

        int y = x%10;
        int z = x%100;
        z = z/10;
        int a = x%1000;
        a = x/100;
        int b = (a*100 + y*10 + z);
        return b;

    }

    public static int timeLeft(curHour, curMin, depHour, depMin.) {
        int curHour;
        int curMin;
        int depHour;
        int depMin;
        
    }
}
