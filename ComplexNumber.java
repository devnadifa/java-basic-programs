public class ComplexNumber {
  int real, image;
  public ComplexNumber(int r, int b) {
    this.real = r;
    this.image = b;
  }
  public void showNumber() {
    System.out.println(this.real + " + i" + this.image);
  }
  public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
    ComplexNumber res = new ComplexNumber(0, 0);
    res.real = n1.real + n2.real;
    res.image = n1.image + n2.image;

    return res;
  }
  public static void main(String[] args) {
    ComplexNumber c1 = new ComplexNumber(4,  5);
    ComplexNumber c2 = new ComplexNumber(10, 5);

    c1.showNumber();
    c2.showNumber();

    ComplexNumber res = add(c1, c2);
    System.out.println("Adding the numbers: ");
    res.showNumber();

  }
}
