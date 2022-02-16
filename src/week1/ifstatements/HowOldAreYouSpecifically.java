package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {

  public static void main(String[] args) {

    Scanner userInputReader = new Scanner(System.in);

    System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
    String userName = userInputReader.nextLine();

    System.out.print("Ok, " + userName + ", how old are you? ");
    int userAge = userInputReader.nextInt();

    if (userAge < 16) {
      System.out.println("You can't drive, " + userName + ".");
    } else if (userAge >= 16 && userAge <= 17) {
      System.out.println("You can drive but not vote, " + userName + ".");
    } else if (userAge >= 18 && userAge <= 24) {
      System.out.println("You can vote but not rent a car, " + userName + ".");
    } else {
      System.out.println("You can do pretty much anything, " + userName + ".");
    }
  }

}
