public class SE1127 {
  public static void main(String[] args) {

    int arr[] = new int[] {10, 16, 11};
    int sum1 = 0;
    int avg = 0;
    for (int i = 0; i < arr.length; i++) {
      sum1 += arr[i];
      {
        if (i == arr.length - 1) {
          avg = sum1 / arr.length;
        }
        System.out.println("Avg=" + avg);
      }
    }

    
    int secondMin = Integer.MAX_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        secondMin = min;
        min = arr[i];
      } else if (arr[i] < secondMin) {
        secondMin = arr[i];
      }
      System.out.println("Second Min=" + secondMin);
    }
  }
}

