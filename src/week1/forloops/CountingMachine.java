package week1.forloops;

import java.util.Scanner;

public class CountingMachine {

  public static void main(String[] args) {

    Scanner userInputReader = new Scanner(System.in);

    System.out.print("Count to: ");
    int userCountNumber = userInputReader.nextInt();

    for (int index = 0; index <= userCountNumber; index++) {
      System.out.print(index + " ");
    }
  }

}
