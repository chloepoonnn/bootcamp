public class DemoMethod {

  // main -> method name
  // public -> or private
  // static method -> tool
  // void -> return type
  public static void main(String[] args) {
    // javax -> compile command, converting .jav -> .class
    // java -> run .class file
    int x = 2;
    int y = 10;
    x *= 2; // 4
    x += y;
    System.out.println("x=" + x); // 14

    y = 100;
    x = 2;
    x *= 2;
    x += y;
    System.out.println("x=" + x); // 104

    // Trigger Method
    int result10 = sum(10, 3);
    System.out.println(result10); // 13
    System.out.println(sum(2, 4)); // 6
    System.out.println(sum(-10, -30)); // 40
    System.out.println(subtraction(40, 10));
    System.out.println(subtraction(80, 100));
    System.out.println(multiplication(3, 6));
    System.out.println(division(10, 3));

    int result13 = sum(10, 3, 20);
    System.out.println(result13);
    int result14 = sum(10, 3, 'a');
    System.out.println(result14);

    double result15 = sum(2.3, 2.5);
    System.out.println("result15= " + result15);

    double v = (double) 7 / 2; // double / int -> double, int / int -> int
  }

  // Method name: sum
  // Return type : int
  // parameters: No parameter or one or more than one parameters
  // f(x1, x2) = x1 + x2
  // y = x1 + x2
  public static int sum(int x1, int x2) {
    int total = x1 + x2;
    return total; // return to 23
  }

  public static double sum(double x1, double x2) {
    double total = x1 + x2;
    return total; // return to 23
  }

  // Method Signature: sum(int x1, int x2, int x3)
  public static int sum(int x1, int x2, int x3) {
    int total = x1 + x2 + x3;
    return total; // return to 23
  }

  // Method Signature: sum(int x1, int x2, char x3)
  public static int sum(int x1, int x2, char x3) {
    int total = x1 + x2 + x3;
    return total; // return to 23
  }



  public static int subtraction(int x1, int x2) {
    int total = x1 - x2;
    return total;
  }

  public static int multiplication(int x1, int x2) {
    int total = x1 * x2;
    return total;
  }

  public static double division(int x1, int x2) {
    double total = (double) x1 / x2;
    return total;
  }


}
