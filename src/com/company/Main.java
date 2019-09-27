// Ankit Amonkar
// Math Exercises (MathEx)

package com.company;

public class Main {

    public static void main(String[] args) {
        int x = swap(271);
        System.out.println(x);
        timeLeft(1,34,8,20);
        int a = dayOfWeek(0,1);  //takes the two arguments and puts it in the method and gives a value for x which is then printed
        System.out.println(a);
        int b = dayOfWeek(0,14);
        System.out.println(b);
        int c = dayOfWeek(6,22);
        System.out.println(c);
        int d = dayOfWeek(5,4);
        System.out.println(d);
        int e = dayOfWeek(1,24);
        System.out.println(e);
        int f = dayOfWeek(2,1);
        System.out.println(f);
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

    public static void timeLeft(int curHour, int curMin, int depHour, int depMin) {
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
        System.out.println(d + " hours " + f + " minutes left");  //prints out the time remaining

    }

    public static int dayOfWeek(int day, int date){
        date = date + day - 1;  //gives the date of the month used, need to subtract one in order to get 1 as the first date
        int x;
        x = date % 7;    //took the remainder after dividing by 7 because there are 7 days in a week and it gives you the day of the week
        return x;

    }
}

/* Results:
217
6 hours 46 minutes left
0
6
6
1
3
2
*/