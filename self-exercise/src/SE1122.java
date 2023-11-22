public class SE1122 {

  public static void main(String[] args) {
    
    int a1 = 5;
        int b2 = 10;
        String c3 = "welcome";
        if(a1 == 5 && b2 == 5){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (a1 == 5 || b2 == 5){
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        if (a1 == 5 && (b2 == 8 || "welcome".equals(c3))){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

                if (a1 == 3 && (b2 == 10 && "welcome".equals(c3))) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }

        if (a1 == 5 || (b2 == 8 && "welcome".equals(c3))){
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        if (a1 == 3 || (b2 == 8 && "welcome".equals(c3))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
  }
  
}
