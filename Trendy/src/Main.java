/*



 */

import java.util.Scanner;


public class Main {
    Scanner mainScanner = new Scanner(System.in);

    int totalViewers;
    int totalMinutes;
    int totalHours;
    
    String myInput;


    public double getWatchTime(){
        System.out.println("What is the total watch time in hours?");
        myInput = mainScanner.nextLine();
        totalHours = Integer.parseInt(myInput);

        System.out.println("What is the total watch time in minutes?");
        myInput = mainScanner.nextLine();
        totalMinutes = Integer.parseInt(myInput);

        double calcs = ((totalHours*60) + totalMinutes)*60; // total seconds

        return calcs;
    }

    public double getRatio(double watchTime){
        // total views * percentage of actual viewers / (hours/60 + minutes)/60

        System.out.println("What is the total number of views?");
        myInput = mainScanner.nextLine();
        totalViewers = Integer.parseInt(myInput);

        double calcs = totalViewers/watchTime;
        calcs = (calcs+0.5);
        calcs = (int)calcs;

        return calcs;
    }


    public static void main(String[] args) {
        double watchTime = new Main().getWatchTime();
        double ratio = new Main().getRatio(watchTime);
        System.out.println(ratio + " viewers were watching per second");
    }
}
