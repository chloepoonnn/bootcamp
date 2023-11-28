import java.util.Arrays;

public class DemoWhileLoop {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);

        int j = 0;
        sum = 0;
        while (j < 5) {
            sum += j++; //
        }
        System.out.println("sum=" + sum + ", j=" + j);


        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.print(i);
            }
        }
        System.out.println("");

        // continue, break
        // Print odd numbers and <= 5
        // 1,3,5 (from 1 - 10)
        j = 0;
        while (++j <= 10) {
            if (j > 5)
                break;
            if (j % 2 == 0)
                continue;
            System.out.println(j);
        }

        // either x or y -> 0 = exit loop
        int x = 10;
        int y = 5;
        while (x > 0 && y > 0) {
            System.out.println("x=" + x + ", y=" + y);
            y--;
            x--;
        }

        // 0 1 1 2 3 5 8 13 ... < 1000
        int a1 = 0;
        int a2 = 1;
        int sum1 = 0;

        while (sum1 < 1000) {
            System.out.print(sum1 + ", ");
            a1 = a2;
            a2 = sum1;
            sum1 = a1 + a2;

        }
        System.out.println("");

        int b2 = 0;
        int b1 = 1;
        int e2 = -1;
        int[] arr = new int[20];
        int idx = 0;
        arr[idx++] = b2;
        // arr [idx++] = b1;
        while (e2 < 1000) {
            e2 = b1 + b2;
            b2 = b1;
            b1 = e2;
            arr[idx++] = b2;
            b1 = e2;
        }
        System.out.println(Arrays.toString(arr));

        int num = 1;
        while (num < 3 || num > 2) {
            num++;
            System.out.println(num);
        }

        boolean isOverLimit = false;
        int limit = 100;
        while (!isOverLimit){
            if (++limit > 100)
            isOverLimit = true;
        }
    }
}
