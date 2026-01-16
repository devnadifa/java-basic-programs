public class GCD {
  static int HCF(int x, int y) {
    if (x == 0) 
      return y;
    if (y == 0)
      return x;
    if (x == y)
      return x;
    //subtracting x & y make them be x == y thus easier to find GCD ()
    if (x > y)
      return HCF(x-y, y);
    return HCF(x, y-x);

  }
  public static void main(String[] args) {
    int x = 10, y = 20;
    System.out.print("The GCD is: " + HCF(x, y));
  }
}
