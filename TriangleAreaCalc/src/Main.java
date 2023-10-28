// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.lang.Math;


public class Main {
    Scanner sc = new Scanner(System.in);
    public static String myInput;
    public static double singArea;
    public static double totalArea;

    public static double perGallon = 400; // 400 square feet per gallon
    public static double totalGallons;


    public double getTotalGallons(double area){
        double gallons;

        gallons = area/perGallon;
        gallons = Math.ceil(gallons);

        return gallons;
    }
    public double getTotalArea(double oneArea){
        double newArea, tris;

        System.out.println("How many triangles are there?");
        myInput = sc.nextLine();
        tris = Double.parseDouble(myInput);

        newArea = tris * oneArea;

        return newArea;
    }
    public double getArea(){
        double a,b,c;
        double area, semiPer, sqrRoot;

        System.out.println("What is the bottom side's length?");
        myInput = sc.nextLine();
        a = Double.parseDouble(myInput);

        System.out.println("What is the left side's length?");
        myInput = sc.nextLine();
        b = Double.parseDouble(myInput);

        System.out.println("What is the right side's length?");
        myInput = sc.nextLine();
        c = Double.parseDouble(myInput);

        semiPer = (a+b+c)/2;
        sqrRoot = Math.sqrt(semiPer*((semiPer-a)*(semiPer-b)*(semiPer-c)));
        area = (double) Math.round(sqrRoot * 100) / 100;

        // https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        area *= 2; // double sided


        return area;
    }



    public static void main(String[] args) {
        singArea = new Main().getArea();
        System.out.println("This is the area of one triangle (in square feet) " + singArea);
        totalArea = new Main().getTotalArea(singArea);
        System.out.println("This is the area all your triangles (in square feet)  " + totalArea);
        totalGallons = new Main().getTotalGallons(totalArea);
        System.out.println("This is the number of gallons you'll need (" + perGallon +
                " square feet per gallon) " + totalGallons);
    }
}