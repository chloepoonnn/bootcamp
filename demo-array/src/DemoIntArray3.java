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
    for (int i = targetIndex ; i < arr2.length - 1; i++) {
        temp = arr2 [i];
        arr2 [i] = arr2 [i+1];
        arr2 [i+1] = temp;
      }
      System.out.println(Arrays.toString(arr2));
    }

  }

