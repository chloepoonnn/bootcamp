public class DemoString {
  public static void main(String[] args) {
    String emaillAddress = "chloe@gmail.com";
    //String s = 3; // s is declared by Sting, so you cannot assign int value
    //int i = "hello"; // i is declred by int, you cannot assign String value

    System.out.println(emaillAddress); // chloe@gmail.com

    // Operations -> append
    String str = "hello" + " " + "world";
    System.out.println(str); // "hello world"

        // Look at the code inside the bracket first
        // Step 1: "hello" + " " + "world" -> "hello world"
        // Step 2: System.out.println() -> print out
    System.out.println("hello" + " " + "world"); // "hello world"

    String str1 = "hello";
    System.out.println(str1); //"hello"
    System.out.println(str1.length()); // 5
    str1 = str1 + "world";
    System.out.println(str1.length()); // 10
    str1 += "!!!";
    System.out.println(str1.length()); // 13

    // No "-", "*", "/" in string
    // String supports "+", "+="

    //if, =, ==
    int x = 0; // 1 = means assignment
    int x2 = 3; //assignment
    if (x == x2) { // == means, asking if they are equals
      // if x and x2 are equal then do sth
      // "x == x2" return false, so the flow will not fall into this block
      System.out.println("x is equals to x2");
    } else {
      System.out.println("x is not equals to x2"); //sysout is the shortcut for System.out.println()
    }
    // String is not a primitive, so you cannot use == to compare their values
    
    String s1 = "hello";
    String s2 = "hello";
    if (s1.equals(s2)){ // comparing 2 string variables
      System.out.println("s1 is equals to s2");
    }
    if ("hello".equals(s1)){ // comparing string value to a string variable
    // if (s1.equals("hello")) *cannot write like this* 
    // *put sting value first*
    System.out.println("s1 is hello");
    }
    if ("hello".equals("hello")){ // always true, so no one will write any coding like this *meaningless*
      System.out.println("ABC");
    }

    // charAt()
    // 4 is an index of Sting.
    // eg. "hello", h is index = 0, e is index = 1, o is index = 4
    // index in Java starts from 0
    // s1.charAt(4) return 'o'
    char c = s1.charAt(4); // o
    System.out.println(c); // 'o'

    s1 = "Vincent";
    // what if we always take the last character of the Sting
    // Approach 1
    int lastCharIndex = s1.length() - 1 ; 
    char lastChar = s1.charAt(lastCharIndex);
    System.out.println(lastChar);

    // Approach 2
    lastChar = s1.charAt(s1.length() - 1 );
    System.out.println(lastChar);

        
  }

}
