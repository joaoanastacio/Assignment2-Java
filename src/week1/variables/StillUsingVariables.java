package week1.variables;

import java.util.Scanner;

public class StillUsingVariables {
  public static void main(String[] args) {

    Scanner userInputReader = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String userName = userInputReader.nextLine();
    System.out.println("Enter your graduation year: ");
    int graduationYear = userInputReader.nextInt();

    System.out.println("My name is " + userName + " and I'll graduate in " + graduationYear);
  }
}
