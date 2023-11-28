import java.util.Arrays;

public class DemoSorting {
  public static void main(String[] args) {
    int[] arr = new int[] {100, 4, 1050, 500, -20};
    // {4, 100, 1050, 500, -20}
    // {4, 100, 1050, 500 ,-20}
    // {4, 100, 500, 1050, -20}
    // {4, 100, 500, -20, 1050}

    // 1. Bubble sort
    int temp = 0;
    for (int i = 0; i < arr.length - 1; i++) { // 4
      for (int j = 0; j < arr.length - 1 - i; j++) { // 4 - i, fixed the arr[5] integer
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          System.out.println(Arrays.toString(arr));
        }
      }
    }


    int[] arr2 = new int[] {4, 3, 2, 10, 12, 1, 5, 6};
    int x = 0;
    for (int i = 1; i < arr2.length; i++) { // i<8
      for (int j = 0; j < arr2.length - i; j++) {
        if (arr2[j + 1] < arr2[j]) {
          x = arr2[j];
          arr2[j] = arr2[j + 1];
          arr2[j + 1] = x;
          System.out.println(Arrays.toString(arr2));
        }
      }
    }

    // 2. Insertion Sort
    int j;
    int key;
    int[] arr3 = new int[] {100, -30, 40, 22, 44};
    for (int i = 1; i < arr3.length; i++) { // start from the 2nd element
      j = i - 1;
      key = arr3[i]; // current element
      while (j >= 0 && arr3[j] > key) {
        arr3[j + 1] = arr3[j];
        j--;
      }
      arr3[++j] = key;
    }
    System.out.println(Arrays.toString(arr3));
  }
}
