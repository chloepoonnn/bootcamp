import java.lang.reflect.Array;
import java.util.Arrays;

public class SE1128 {
  public static void main(String[] args) {
    int[] arr = new int[] {10, 2, 8, 4, 5};
    // ascending order
    int max = Integer.MIN_VALUE;
    for (int i = 1; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i; j++) {
        if (arr[j] > arr[j + 1]) {
          max = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = max;
          System.out.println(Arrays.toString(arr));
        }
      }
    }

    String s = "abcabcabcabcabc";
    char[] arr5 = new char[s.length()];
    char[] arr6 = s.toCharArray(); //
    char[] arr7 = new char[s.length()];
    
        for (int i = 0; i < s.length(); i++) {
          if (arr6[i] == 97) {
            arr6[i] = 99;
          }
        }
        System.out.println(arr6);
        
  }
}
