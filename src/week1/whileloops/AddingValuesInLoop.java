package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {

  public static void main(String[] args) {

    Scanner userInputReader = new Scanner(System.in);
    int summarizedValue = 0;
    int userNumber = 1;

    System.out.println("I will add up the number you give me.");

    while (userNumber != 0) {
      System.out.print("Number: ");
      userNumber = userInputReader.nextInt();

      if (userNumber == 0) {
        break;
      }
      summarizedValue += userNumber;

      System.out.println("The total so far is " + summarizedValue);
    }

    System.out.println("The total is " + summarizedValue + ".");
  }

}
