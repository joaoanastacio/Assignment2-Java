package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {

  public static void main(String[] args) {

    Scanner userInputReader = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    String userName = userInputReader.nextLine();

    System.out.print("Hi, " + userName + "! How old are you? ");
    int userAge = userInputReader.nextInt();

    System.out.println("Did you know that in five years you will be " + (userAge + 5) +
        " years old?\nAnd five years ago you were " + (userAge - 5) + "! Imagine that!");
  }

}
