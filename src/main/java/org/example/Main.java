package org.example; //DO NOT DELETE
import java.util.Scanner; // Import the Scanner class
import java.text.NumberFormat;

class Main {
  public static void main(String[] args) {
    //CODE GOES HERE

	Scanner gallons = new Scanner(System.in);
  System.out.println("Enter number of gallons: ");
  double gall = gallons.nextDouble();
  NumberFormat num = NumberFormat.getNumberInstance();
  System.out.println("In " + num.format(gall) + " gallons there are:");
  double quart = gall*4;
  System.out.println(num.format(quart) + " quarts");
  double pint = quart*2;
  System.out.println(num.format(pint) + " pints");
  double cup = pint*2;
  System.out.println(num.format(cup) + " cups");
  double tbsp = cup*16;
  System.out.println(num.format(tbsp) + " tablespoons");
  }
}
  