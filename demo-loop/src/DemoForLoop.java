public class DemoForLoop {
    public static void main(String[] args) {

        int x = 2;

        // counter initialization ; counter's continue condition ; counter's movement
        // Step 1: int i = 0;
        // Step 2: i < 4 ??
        // Step 3: Yes -> x*=2
        // Step 4: sysout
        // Step 5: i++
        // Step 6: i < 4 ?? i is 1
        // Step 7: Yes -> x*=2
        // Step 8: sysout
        // Step 9: i++
        // Step 10: i< 4 ?? i is 2
        // Step 11: Yes -> x*=2
        // Step 12: sysout
        // Step 13: i++
        // Step 14: i < 4 ?? i is 3
        // Step 15: Yes -> x *=2
        // Step 16: sysout
        // Step 17: i++
        // Step 18: i < 4? i is 4
        // Step 19: NO. Exit loop
        for (int i = 0; i < 4; i++) { // must be int // 0,1,2,3
            x *= 2;
            System.out.println("x=" + x);
        }


        // x *= 2;
        // System.out.println("x+" + x);
        // x *= 2;
        // System.out.println("x+" + x); //
        // x *= 2;
        // System.out.println("x+" + x); // 32


        // 0 + 1 + 2 + 3 + 4 + ... + 10 -> total
        int total = 0;
        for (int i = 0; i < 11; i++) {
            total += i;
        }
        System.out.println("total=" + total);

        // 0 + 1 + 2 + 3 + 4 + ... + 10 -> total
        int total2 = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                total2 += i;
            }
        }
        System.out.println("total2=" + total2);

        // 0 - 100
        // i) 0 - 50, odd -> sum1
        // ii) 51 - 100, even -> sum2
        // total sum1 * sum2

        int total3 = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 101; i++) {
            if (i <= 50 && i % 2 == 1) { // if (i < 51) {
                                         // if ( 1 % 2 == 1)
                sum1 += i;
            } else if (i > 50 && i % 2 == 0) { // else {
                                               // if (i % 2 == 0) {
                sum2 += i;
            }
            total3 = sum1 * sum2;
        }
        System.out.println("total3=" + total3);


        // continue
        // sum up all odd number (0-100)
        int sum = 0;
        for (int i = 0; i < 101; i++) { // 0,1,2,3,4..100
            // skip even number: continue
            if (i % 2 == 0) {
                continue; // go to the next iteration, skip the rest of codes = continue to i++
            }
            // for even number, the following code will skipped
            sum += i;
        }
        System.out.println("sum=" + sum);

        // break -> exit the loop directly
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                break;
            }
            System.out.println("i=" + i);
        }
        // sum up all odd number (0-100),
        /*
         * i) sum <= 200 the loop should be end at which number of i?
         */

        int sum5 = 0;
        int i = 0;
        for (int j = 0; j < 101; j++) {
            if (j % 2 == 0) {
                continue;
            }

            if (sum5 + j >= 200) {
                break;
            }
            sum5 += j;
            i = j;

        }
        System.out.println("i=" + i + ",sum5=" + sum5);



    }
}


