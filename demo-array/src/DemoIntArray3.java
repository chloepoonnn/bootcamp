import java.util.Arrays;

public class DemoIntArray3 {
  public static void main(String[] args) {
    int[] arr = new int[] {100, -100, 34};

    // for loop
    // {-100, 100, 34}

    int x = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        // swapping
        x = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = x;
      }
      System.out.println(Arrays.toString(arr));
    }

    // move targetIndex to the tail of the array
    int[] arr2 = new int[] {100, -20, 4, 100, 500};
    int targetIndex = 1;
    // expected result = {100, 4, 100, 500, -20}
    int temp = 0;
    // for loop
    for (int i = targetIndex; i < arr2.length - 1; i++) {
      temp = arr2[i];
      arr2[i] = arr2[i + 1];
      arr2[i + 1] = temp;
    }
    System.out.println(Arrays.toString(arr2));

    int temp1 = 0;
    for (int i = 0; i < arr2.length - 1; i++) {
      if (i >= targetIndex) {
        temp1 = arr2[i];
        arr2[i] = arr2[i + 1];
        arr2[i + 1] = temp1;
      }
    }
    System.out.println(Arrays.toString(arr2));


    // find the max value, and move to the tail
    int[] arr3 = new int[] {100, 4, 1050, 500, -20};
    int max = 0;
    int maxIndex = -1;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > max) {
        max = arr3[i];
        maxIndex = i;
        System.out.println(Arrays.toString(arr3));
      }

    }

    int max2 = 0;
    int maxIndex2 = 0;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > max2) {
        max2 = arr3[i];
        maxIndex2 = i;
      }
    }

    // Approach 2:
    int temp3 = 0;
    int[] arr4 = new int[] {100, 4, 1050, 500, -20};
    // {4, 100, 1050, 500, -20}
    // {4, 100, 1050, 500 ,-20}
    // {4, 100, 500, 1050, -20}
    // {4, 100, 500, -20, 1050}
    for (int j = 0; j < arr4.length - 1; j++) // 4
      for (int i = 0; i < j + 1; i++) { //
        if (arr4[i] > arr4[i + 1]) {
          temp3 = arr4[i];
          arr4[i] = arr4[i + 1];
          arr4[i + 1] = temp3;
        }
      }
    System.out.println("arr4=" + Arrays.toString(arr4));

    // replace a -> c
    // "abcabcabcabcabc" -> "cbccbccbccbccbc"
    String s = "abcabcabcabcabc";
    char[] arr5 = new char[s.length()];

    // Approach 1
    for (int i = 0; i < s.length(); i++) {
      // charAt(1)
      arr5[i] = s.charAt(i);
    }

    // Approach 2
    char[] arr6 = s.toCharArray(); //
    char[] arr7 = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        arr[i] = 'c';
        continue;
      }
      arr7[i] = s.charAt(i);
    }

    // From array to String
    System.out.println(String.valueOf(arr7));

    String str = "hello";
    str = new String("hello");
    str = String.valueOf("hello");

    System.out.println(String.valueOf(1));
    System.out.println(String.valueOf(1.0d));
    System.out.println(String.valueOf(1.0f));
    System.out.println(String.valueOf(1L));
    System.out.println(String.valueOf(new char[] {'a', 'b'})); // ab
    // System.out.println(String.valueOf(new int[] {1, 2, 3})); // NOT OK

    // Replace (String method)
    String str4 = "abcabcabcabcabc";
    String result4 = str4.replace("a", "c"); // replace a by c
    System.out.println("str4=" + str4); // result4= cbccbccbccbc
    System.out.println("result4=" + result4); // result4= cbccbccbccbc

    // replace a pattern "ab" by "ij"
    System.out.println(str4.replace("ab", "ij")); // ijcijcijcijc 
  }
}

