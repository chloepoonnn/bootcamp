import java.util.Arrays;

public class DemoStringArray {
  public static void main(String[] args) {
    // "abc" "ijk" "xyz"
    String[] string = new String[] {"abc", "ijk", "xyz"};
    String[] string2 = new String[3];
    string2[0] = "abc";
    string2[1] = "ijk";
    string2[2] = "xyz";

    // for loop
    // strings1 [0] -> "abcijk"
    // strings2 [1] -> "ijkxyz"
    // strings3 [2] -> "xyz"
    for (int i = 0; i < string.length; i++) { //0,1,2
      if (i < string.length - 1) {
        string[i] = string[i].concat(string[i + 1]);
      } else {
        string[i] = string[i].concat("!");
      }
    }
  System.out.println(Arrays.toString(string));

  for (int i = 0; i < string2.length; i++) { //0,1,2
      if (i < string2.length - 1) {
        string[i] = string2[i].concat(string2[i + 1]);
        continue;
      }
      string2[i] = string2[i].concat("!");
    }
System.out.println(Arrays.toString(string));
  
  }
}
