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

        double calcs = (totalHours*60) + totalMinutes;

        return calcs;
    }

    public double getRatio(double watchTime){
        System.out.println("What is the total number of viewers?");
        myInput = mainScanner.nextLine();
        totalViewers = Integer.parseInt(myInput);

        double calcs = totalViewers/watchTime*60;
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