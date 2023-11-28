public class DemoStringMethod {
  public static void main(String[] args) {
    String str = "  hello world!  ";
    // isEmpty()
    if (!str.isEmpty()) {
      System.out.println("String=" + str);

      // length ()
      System.out.println("str length=" + str.length());
    }

    // charAt ()
    // even number index of the character in string
    for (int i = 0; i < str.length(); i++) {
      if (i % 2 == 0 && i > 0) {
        System.out.print(str.charAt(i)); // **
      }
    }
    System.out.println("");

    // substring(startIndex, ednIndex - 1)
    // substring(startIndex)
    String s = "hello";
    String newStr = s.substring(2, 4); // ll, index start from 0, (x,y) -> find index2 print out till index<4
    System.out.println("newStr=" + newStr);// ll, print -> index from 2 to 3
    System.out.println(newStr.substring(0)); // ll
    // System.out.println(str.substring(0, str.length()-1));


    // trim (), remove all spaces in the head and tail of the string
    // str = " hello world! "
    System.out.println(str.trim()); // "hello world!"
    System.out.println(newStr.trim());


    String s2 = "HEllo, woRld!!";
    System.out.println(s2.toUpperCase()); // HELLO, WORLD!!
    System.out.println(s2.toLowerCase()); // hello, world!!

    // equals()
    // equalsIgnoreCase()
    System.out.println("HEllo, woRld!!".equals("hello, world!!")); // false
    System.out.println("HEllo, woRld!!".equalsIgnoreCase("hello, world!!")); // true
    System.out.println("HEllo, woRld!!".equalsIgnoreCase("hello")); // false

    // startsWith("")
    // endsWith("")
    System.out.println(s2.startsWith("HEllo")); // true
    System.out.println(s2.startsWith("Hello")); // false
    System.out.println(s2.startsWith("H")); // true
    System.out.println(s2.startsWith(" ")); // false
    System.out.println(s2.startsWith("")); // true

    System.out.println(s2.endsWith("woRld!!")); // true
    System.out.println(s2.endsWith("world!!")); // false
    System.out.println(s2.endsWith("d")); // false
    System.out.println(s2.endsWith("!")); // true
    System.out.println(s2.endsWith(" ")); // false

    String s3 = "1234567890";
    // Try 2 String methods, and use && operator to check true/false
    // return true

    System.out.println((s3.length() == 10 && s3.startsWith("1"))); // true
    System.out.println(
        "56".equals(s3.substring(4, 6)) && s3.charAt(s3.length() - 1) == '0'); // true // length-1 = the last char

    // indexOf()
    System.out.println(s3.indexOf('7')); // 6 (int) , tht 'charcter' geh index
    System.out.println(s3.indexOf('m')); // -1 (int)

    // searching '7' starting from index 8
    System.out.println(s3.indexOf('7', 8)); // -1

    System.out.println(s3.indexOf('8')); // 7
    System.out.println(s3.indexOf('5', 2)); // 4
    System.out.println(s3.indexOf('0')); // 9

    // lastIndexOf()
    String s4 = "1234512345;";
    System.out.println(s4.indexOf('5')); // 4, return the first occurence of '5' , dai 4 gor index is 5
    System.out.println(s4.lastIndexOf('5')); // 9, return the lat occurence of '5', have 2gor '5' chut jui mei gor goh '5'

    System.out.println(s4.indexOf("345")); // 2, '345' goh '3' first appear in index 2
    System.out.println(s4.indexOf("3 45")); // -1

    System.out.println(s4.lastIndexOf("345")); // 7
    System.out.println(s4.lastIndexOf("3 45")); // -1

    System.out.println(s4.lastIndexOf('4', 7)); // 3 , lastIndexof(' ', ) **finding backward** ,
    // starting from index7 -> going backwards to find '4'
    System.out.println(s4.lastIndexOf('4', 2)); // -1

    String s5 = "ABabcxabcdef";
    System.out.println(s5.lastIndexOf("abc") == 6); //
    System.out.println(s5.endsWith("def")); //
    System.out.println(s5.indexOf("abc") == 2); //
    System.out.println(s5.startsWith("ABa")); //
    System.out.println(s5.length() > 10);

    // concat
    String s6 = "abc";
    String s7 = "def";
    System.out.println(s6 + s7); // "abcdef" *use this
    System.out.println(s6.concat(s7)); // "abcdef" **dun use + for string

    System.out.println(s5.contains("abcdef")); // true *use this
    // that String yup min yau mo "xxx"
    System.out.println(s5.contains("xxx")); // false
    System.out.println(s5.indexOf("abcdef") != -1); // true

    String result = s5.toUpperCase();
    System.out.println(result); // ABABCXABCDEF
    String result2 = result.substring(3, 5); // BC
    System.out.println(result2);

    String result3 = s5.toUpperCase().substring(3, 5);
    System.out.println(result3); // BC
    String result4 = s5.toUpperCase().substring(1,2).concat("ijk");
    System.out.println(result4); // Bijik
    


  }
}
