public class SE1124 {
  public static void main(String[] args) {

    // print the first 10 numbers from 0
    // 10 odd numbers
    // starting from the second number
    // print the second - tenth odd number

    int times = 0;
    for (int i = 0; i < 100; i++) {
      if (i % 2 != 0) {
        times++;
        if (times > 1 && times < 11) {
          System.out.println(i);
        }
      }
    }

    // "*** *** *** ***"
    int a = 0;
    for (int i = 0; i < 12; i++) {
      a++;
      if (a % 3 == 0) {
        System.out.print("*** ");
      }
      // System.out.print("*");
    }

    System.out.println("");
    int a1 = 0;
    for (int i = 0; i < 12; i++) {
      a1 = i+1;
      if (a1 % 4 != 0) {
        System.out.print("*");
      } else {
        System.out.print(" ");
      }
    }



  }
}
