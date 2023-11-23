public class DemoOperator {
    
    public static void main(String[] args) {
        int x = 2;
        x++;
        ++x;
        x += 1;
        x = x + 1; //6

        // difference between x++ amd ++x
        int a = 5;
        int preIncrement = ++a; // a is increment by 1 first, and then being assigned to the variable
        // a -> 6 first then preIncrement -> 6
        System.out.println("preIncrement=" + preIncrement);
        System.out.println("a=" + a);

        int b = 5;
        int postIncrement = b++; // assign the value of variable a to postIncrement first
        // postIncrement --> 5, b -> 6
        System.out.println("postIncrement=" + postIncrement);
        System.out.println("b=" + b);
        

        int e = 5;
        int e1 = --e;
        System.out.println("e1=" + e1);
        System.out.println("e=" + e);

        int d = 5;
        int d1 = d--;
        System.out.println("d1=" + d1);
        System.out.println("d=" + d);

        int c = 1;
        int postIncrement3 = c;
        c++;
        

        // Conditional Operator
        // && || !
        // Example 1 - AND
        if(c == 2 && b == 4) { // && = both two conditions need to be fulfilled
            // (c == 2 ) -> true
            // (b == 4) - > flase
            // true || false -> false 
            System.out.println("example1 = yes");
        } else {
            System.out.println("example1 = no");
        }

        // Example 2 - OR
        if (c == 2 || b == 4) { // either conditions be fulfilled
            // (c == 2) -> true
            // (b == 4) -> flase
            // (true || flase) -> true
            System.out.println("example2 = yes"); 
        } else {
            System.out.println("example2 = no");
        }

        // Example 3 - AND OR
        String h = "hello";
        if (c == 2 && (b == 4 || "hello".equals(h))) { 
            // (c == 2) -> true
            // (b == 4) -> flase
            // "hello".equals(h) -> true
            // (true && (false || true)) -> true
            System.out.println("example3 = yes"); 
        } else {
            System.out.println("example3 = no");
        }

        // Example 4 - AND
        if (c == 1 && b == 6) {
            // (c == 1) -> false
            // (b == 6) -> will NOT be executed
            System.out.println("example4 =yes");
        } else {
            System.out.println("example4 = no");
        }

        // Example 5 - AND OR 
        if ( c == 1 || b == 4 && "hello".equals(h)) {
        // b == 4 -> flase
        // "hello".equals(h) -> true
        // c ++ 1 -> false
        // false || false && true
        // fasle || false 
        // false
        System.out.println("example5 = yes");
        } else {
            System.out.println("example5 = no");
        }

        // Example 6 - AND OR
        if (h.charAt(3) == 'e' || b == 6) {
            // h.charAt(3) -> 'l'
            // b == 6 -> true
            // false || true
            // true
            System.out.println("example6 = yes");
        }

        // Comparision operators NOT only exists in if statements
        // boolean -> && ||
        boolean b1 = true && false; // true AND false == false
        System.out.println("b1=" + b1); // false

        boolean b2 = false;
        boolean b3 = true;

        boolean result = b2 || b3;
        System.out.println("Result=" + result); // true

        boolean result2 = b2 || b3 && b1;
        System.out.println("result2= "+ result2); //false

        //Example 7
        if (b1 == false) { // asking b1 == false? = !b1
            System.out.println("example 7a = b1 is false"); // print
        }

        if (!b1) { // b1 == false
            System.out.println("example 7b = b1 is false"); // print
        }
        
        // Example 8
        if (b1 == true) { // b1
        System.out.println("example 8a = b1 is true"); // not print
        }
        
        if (b1) { // another approach. asking if b1 == true?
            // *if* chut true/false
            System.out.println("example 8b = b1 is true"); // not print, cuz it is not true
        }

        int g = 0;
        if (b1 == false) {
            g = 10; // will assign, since b1 is false
            System.out.println("g=" + g); // g = 10 
        }

        int j = 0;
        if (b1 == true) {
            j = 10;
            System.out.println("j=" + j); // not print?
        }

        int q = 0;
        if (b1 == true) {
            q = 10;
        } else {
            q = 0;
        } System.out.println("q=" + q); // q = 0

        // Another expression
        int k = b1 == false ? 10 : 0;
        System.out.println("k=" + k); // k = 10
        // if b1 is false, assign 10 to k, otherwise 0

        int y = b1 == true ? 10 : 0;
        System.out.println("y=" + y); // y = 0

        int a1 = 10;
        int a2 = 4; 
        int min;

        if (a1 < a2) {
            min = a1;
        } else {
            min = a2;
        }
        System.out.println("min=" + min);

        if (a1<a2){
            System.out.println("min=" + a1);
        } else {
            System.out.println("min=" + a2);
        }

        int min2 = a1<a2 ? a1 : a2;
        System.out.println("min2=" + min2);


        int number = 13;
        boolean isOdd1 = false; // minor case

        boolean isOdd = number % 2 == 1 ? true : false;
        System.out.println("Odd Number: " + isOdd); // Odd Number: true


        if (number % 2 == 1) {
            isOdd1 = true;
        } else {
            isOdd1 = false;
        }
            System.out.println("Odd Number: " + isOdd);


            double totalAmount = 0.0d;
            int itemTotal = 2211;
            double feeRate = 0.03;
            
            // if itemTotal > 3000, no transportation fee, otherwise +3% transportation fee

            if(itemTotal>3000) {
                totalAmount = itemTotal;
            } else {
                totalAmount = itemTotal* (1+feeRate);
            }
            System.out.println("Total Amount=" + totalAmount);
        

            double transFee = 0.0d;
            if (itemTotal <= 3000) {
            transFee = itemTotal * feeRate;
        }
            totalAmount = itemTotal + transFee;

            System.out.println("Total Amount=" + totalAmount);


            boolean isPassed = false;
            if (!isPassed) { // == false , asking if this hai m hai m hai isPassed
                System.out.println("isPassed is false");
            }
            isPassed = true; // re-assignment
            if (isPassed) {
                System.out.println("isPassed is true");
            }

            String str = "www.apple.com";
            if (str.length() < 10 || "www.apple.com".equals(str)) {
                System.out.println("length < 10 or www.apple.com");
            } 
            
            String s = ""; // empty string, length = 0
            System.out.println(s.length()); // 0
            s += "hello";
            if (!s.isEmpty()){
                System.out.println("s is NOT empty");
            }

            
    }
}




    

