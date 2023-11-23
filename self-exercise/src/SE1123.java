public class SE1123 {
  public static void main(String[] args) {

    int num1 = 10;
    if (num1 > 50) {
      System.out.println("num1 is larger than 50");
    } else {
      System.out.println("num1 is smaller than 50");
    }

    char grade = 'F';
        if (grade == 'A') {
            System.out.println("grade=A");
        } else if (grade == 'B') {
            System.out.println("grade=B");
        } else if (grade == 'C') {
            System.out.println("grade=C");
        } else if (grade == 'D') {
            System.out.println("grade=D");
        } else if (grade == 'E') {
            System.out.println("grade=E");
        } else { // grade == 'F'
            System.out.println("Fail");
        }
        
    int score = 40;
    if (score < 50) {
      grade = 'F';
        } else if (score < 60) {
      grade = 'E';
        } else if (score < 70) {
      grade = 'D';
        } else if (score < 80) {
      grade = 'C';
        } else if (score < 90) {
      grade = 'B';
        } else {
      grade = 'A';
        }
  System.out.println("Grade=" + grade);

  int score2 = 80;
  if (score < 50 || score2 < 50) {
    grade = 'F';
       } else if ((score + score2) / 2 < 60) {
    grade = 'E';
       } else if ((score + score2) / 2 < 70) {
    grade = 'D';
       } else if ((score + score2) / 2 < 80) {
    grade = 'C';
        } else if ((score + score2) / 2 < 90) {
    grade = 'B';
} else {
    grade = 'A';
}
System.out.println("Grade=" + grade);

int y = 3;
        for (int i = 0 ; i < 5 ; i++) { //0,1,2,3,4
            y += 3;
            System.out.println("y=" + y);
        }

        

        int total4 = 0;
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < 51; i++) {
            if (i % 2 == 1) {
                sum3 += i;
            } else if ((i + 51) % 2 == 0) {
                sum4 += i + 51;
            }
            total4 = sum3 * sum4;
        }
        System.out.println("total4=" + total4);

        int sum5 = 0;
        
         for (int i = 0 ; i < 101 ; i++) {
            if ( i % 2 == 0) {
                continue;
            }
            
            if (sum5 + i >= 200) 
            {
                break;
            }
            sum5 += i;
            System.out.println("i=" + i + ",sum5=" + sum5);
         }
         
  }
}
