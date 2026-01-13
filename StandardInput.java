import java.util.Scanner;

public class StandardInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number ");

    int number = sc.nextInt(); // read integer input
    System.out.print("The number is " + number);
    
    sc.close();
  }
}