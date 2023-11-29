import java.util.Arrays;

public class DemoForEachLoop {
  public static void main(String[] args) {
    Integer[] integers = new Integer[] {100, -30, 20};

    for (Integer i : integers) {
      System.out.println("i=" + i);
    }

    ;
    for (int i = 0; i < integers.length; i++) {
      System.out.println("i=" + integers[i]);
    }

    String str = "abc,def,ijk,zxy";
    String[] parts = str.split(",");
    for (String s : parts) {
      System.out.println("part=" + s);
    }

    String str1 = "abcabcabcabc";
    String[] a = str1.split("b");
    System.out.println(Arrays.toString(a));
    for (String s : a) {
      System.out.println("a=" + s);
    }


  }
}
