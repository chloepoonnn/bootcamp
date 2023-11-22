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
        
        // if buy >= 500 dollars -> 80% off
        double totalAmount = 0.0d;
        int amount = 300;
        double discount = 0.8d; 

        if (amount >= 500) {
            totalAmount = amount * discount;
        } else {
            totalAmount = amount;
        }
        System.out.println("Total Amount = " + totalAmount);

        // if buy > 600 -> 90% off, after discount still >=600 -> free shipping fee, otherwise $30 shipping fee

        double totalAmount2 = 0.0d;
        int amount2 = 1000;
        int afterDiscount = 600;
        double discount2 = 0.9d;
        int shippingFee = 30;

        if (amount2 > 600) {
            totalAmount2 = amount2 * discount2;
        } else {
            totalAmount2 = amount2;
        }

        if (totalAmount2 <= afterDiscount) {
            totalAmount2 = totalAmount2 + 30;
        }
        System.out.println("Total amount 2 =" + totalAmount2);

    }
  
}
