public class DemoSwitch {
  public static void main(String[] args) {
    // if, else-if, -> comparision and logical (&& ||) operators

    // == switch: single value comparios (==)
    char vipGrade = 'N'; // G / S / N
    double discount = 0.0d; // Silver(S) -> 10% , Gold(G) -> 20%
    switch (vipGrade) {
      case 'G': // case = if, walk 9 -> 10 -> 12
      discount += 0.1d;
      case 'S': // walk 11 -> 12
      discount += 0.1d;
      case 'N': // walk 13
      
    }
    System.out.println("discount=" + discount);

    // with break
    discount = 0.0d;
    switch (vipGrade) {
      case 'G': 
      discount += 0.2d;
      break;
      case 'S': 
      discount += 0.1d;
      break;
      case 'N': 
      default: // other charactersen

  }
  System.out.println("discount=" + discount);
}
}
