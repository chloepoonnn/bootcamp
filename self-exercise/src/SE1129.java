public class SE1129 {

  public static void sayHello(String name) {
    System.out.println("Hello, " + name + "!");
  }

  

  public static void main(String[] args) {
      String [] arr = new String [] {"john", "david", "kyle"};
      for (int i = 0; i < arr.length; i++) {
      String person = arr[i];
      sayHello(person);
      }
    }

    }
    



