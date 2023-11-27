public class DemoNestedLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) { // 0,1,2,3,4
      // System.out.println("*");
      /*
       * 
       * 
       * 
       */
      System.out.print("*"); // *****
    }
    System.out.println("");

    // when i=0, j -> 0,1,2,3
    // when i=1, j -> 0,1,2,3
    // when i=2, j -> 0,1,2,3
    // when i=3, j -> 0,1,2,3
    // when i=4, j -> 0,1,2,3
    for (int i = 0; i < 4; i++) { // outer loop
      System.out.println("Hello!!!!!, i=" + i);
      for (int j = 0; j < 3; j++) { // inner loop
        if (i > 1 && j > 1) {
          break;
        }
        System.out.println("World!!, j=" + j);
      }
    }

    // i < 5
    // j < 4
    // system.out.println() ; -> print a new line
    // system.out.print() ; -> print
    for (int i = 0; i < 5; i++) { // row (becuz u added println)
      for (int j = 0; j < 4 - i; j++) { // column -> variable length
        System.out.print("*");
      }
      System.out.println("");
    }

    // ****
    // ***
    // **
    // *

    // nested loop, 4 char in a row
    // abcd
    // efgh
    // ijk
    String str = "abcdefghijk";
    int count = 0;
    for (int i = 0; i < str.length(); i++) { // variable length

      System.out.print(str.charAt(i));
      if (++count % 4 == 0) {
        System.err.println("");
      }
    }
    System.out.println("");

    // Example 4a
    System.out.println("Example 4a:");
    int noOfGroup = 6;
    for (int i = 0; i < noOfGroup; i++) {
      for (int j = 0; j < 3; j++) {
        // "*** *** *** *** *** ***"
        System.out.print("*");
      }
      if (i != noOfGroup - 1) {
        System.out.print(" ");
      }
    }

    System.out.println("");
    System.out.println("Example 4b:");

    int cnt = 0;
    for (int i = 0; i < 6; i++) {
      // if (++cnt % == 0)
      System.out.print("*** ");
    }
  }
}


