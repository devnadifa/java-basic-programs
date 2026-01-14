public class SwapNumbers {
  public static void main(String[] args) {
    int num1 = 2;
    int num2 = 7;
    int placeholder;
    //print the numbers
    System.out.println("Num1 is " + num1);
    System.out.println("Num2 is " + num2);
    //swap the 2 numbers
    placeholder = num1;
    num1 = num2;
    num2 = placeholder;
    //print the swapped numbers
    System.out.println("Num1 is now " + num1);
    System.out.println("Num2 is now " + num2);
    
  }
  
}
