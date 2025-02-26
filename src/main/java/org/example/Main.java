package org.example; //DO NOT DELETE
import java.util.Scanner; // Import the Scanner class
import java.text.NumberFormat;

class Main {
  public static void main(String[] args) {
    //CODE GOES HERE

	Scanner gallons = new Scanner(System.in);
  System.out.println("Enter number of gallons: ");
  int gall = gallons.nextInt();
  NumberFormat num = NumberFormat.getNumberInstance();
  System.out.println("In " + num.format(gall) + "gallons there are:");
  int quart = gall*4;
  System.out.println("Number of hours: " + num.format(quart));
  int pint = quart*2;
  System.out.println("Number of minutes: " + num.format(pint));
  int cup = pint*2;
  System.out.println("Number of Seconds: " + num.format(cup));
  int tbsp = cup*16;
  System.out.println("Number of Seconds: " + num.format(tbsp));
  }
}
  