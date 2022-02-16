package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {

  public static void main(String[] args) {

    Scanner userInputReader = new Scanner(System.in);

    System.out.println("Hello. What is your name? ");
    String userName = userInputReader.nextLine();

    System.out.println("Hi, " + userName + "! How old are you?");
    int userAge = userInputReader.nextInt();

    System.out.println("So you're " + userAge + ", eh? That's not old at all!\n"
        + "How much do you make, " + userName + "?");
    double userSalary = userInputReader.nextDouble();

    System.out.println(userSalary + "! I hope that's per hour and not per year! LOL!");
  }

}
