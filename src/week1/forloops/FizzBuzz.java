package week1.forloops;

public class FizzBuzz {

  public static void main(String[] args) {

    for(int index = 1; index <= 100; index++) {
      if (isMultipleOfThree(index) && isMultipleOfFive(index)) {
        System.out.println("FizzBuzz");
      } else if (isMultipleOfFive(index)) {
        System.out.println("Buzz");
      } else if (isMultipleOfThree(index)) {
        System.out.println("Fizz");
      } else {
        System.out.println(index);
      }
    }
  }

  public static boolean isMultipleOfThree(int number) {
    return number % 3 == 0;
  }

  public static boolean isMultipleOfFive(int number) {
    return number % 5 == 0;
  }

}
