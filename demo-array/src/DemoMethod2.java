public class DemoMethod2 {

  public static void main(String[] args) {
    System.out.println(append("abc", "def"));
    System.out.println(getLastChar("abc"));
    System.out.println(getLastChar(""));
    System.out.println(isStartedWith("helloworld", "hello"));
    System.out.println(remove("acbbcdabc", "bcd"));
  }
  // s1 -> "abc"
  // s2 -> "def"
  // return "abcdef"
  public static String append(String s1, String s2) {
    return s1.concat(s2);
  }

  // Get the last character of the String s
  // if s length < 1, return ' ' (space character)
  public static char getLastChar(String s) {
    if (s.length() < 1 ) {
      return ' ';
    } else {
    return s.charAt(s.length() - 1);
  }
}

  // s -> "helloworld"
  // prefix -> "hello"
  // return true
  public static boolean isStartedWith(String s, String prefix) {
    if (s.startsWith(prefix)) {
      return true;
    } else {
      return false;
    }
  }

  // s -> "abcbcdabc"
  // toBeRemove -> "bcd"
  // return "abcabc"
  public static String remove(String s, String toBeRemoved) {
      return s.replace(toBeRemoved, "");
  }
}
