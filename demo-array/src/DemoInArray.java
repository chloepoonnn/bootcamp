public class DemoInArray {
    public static void main(String[] args) {
        int age1 = 20;
        int age2 = 25;
        int age3 = 30;
        int age4 = 28;

        // Define an array (container) to store a list of int number
        // This array (container) can only store int number
        int[] arr = new int[9]; // [length of array], by index 0-8
        // assignment
        arr[0] = 20;
        System.out.println("arr[0]=" + arr[0]); // 20
        arr[1] = 25;
        arr[3] = 30;
        arr[8] = 28;


        int a; // local variable
        a = 1; // explicitly assignment
        System.out.println(a); // must explicitly assign value to local variable before using it

        int[] arr2 = new int[5];
        int[] arr3 = new int[] {100, 5, 30, 9, -40};
        double[] arr4 = new double[] {1.2, 4.9, 4.3, 23.0};
        char [] arr5 = new char [] {'a','b','c','d'};
        boolean [] arr6 = new boolean [] {true, false, false};
        String [] arr7 = new String [] {"abc"};


        // 8 primitives + string
        // char []
        // boolean []
        // String []

        System.out.println(arr2.length); // 5

        arr2 = new int[10];
        System.out.println(arr2.length); //10


        // array support for loop

        int b = 100;



    }
}

