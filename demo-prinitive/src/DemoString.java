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
    System.out.println(str1.length()); //5
    str1 = str1 + "world";
    System.out.println(str1.length()); //10
    str1 += "!!!";
    System.out.println(str1.length());

    // No "-", "*", "/" in string
    // String supports "+", "+="
  }

}
