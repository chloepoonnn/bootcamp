public class DemoASCII {
  public static void main(String[] args) {
    char value = 'C';
    int ascii = value; // 67
    System.out.println(ascii);

    System.out.println(value == 'C'); // true
    System.out.println(value == 67); // true
    System.out.println(value > 64); // true
    System.out.println(value < 64); // false
    // 0 = 46 A = 65 a = 97

    char c2 = '好';
    int ascii1 = c2;
    System.out.println(ascii1);// 22909

    char value2 = '~';
    int ascii2 = value2;
    System.out.println(ascii2);

    String s1 = "abcdef";
    String s2 = "banana";
    String s3 = "ABCDEF";
    String s4 = "acbdef";
    String s5 = "abcd";
    String s6 = "abcA";

    System.out.println(s2.compareTo(s1)); // 1 ('b' - 'a')
    System.out.println(s1.compareTo(s2)); // -1 ('a' - 'b')
    System.out.println(s3.compareTo(s1)); // -32 ('A' - 'a') 65 - 97
    System.out.println(s4.compareTo(s1)); // 1, same 'a', then compare second character
    System.out.println(s5.compareTo(s1)); // -2, same characters , will compare the length
    System.out.println(s6.compareTo(s1)); // -35 ('A' - 'd') 65 - 100
    // * String cannot use operators
    
  }
}
