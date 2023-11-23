public class Demoif {
    public static void main(String[] args) {
        // double salary = 15000.0; // by default 15000.0 is double;
        double salary = 15000.0d;
        if (salary > 14000) {
            System.out.println("salary > 14000");
        }

        if (salary >= 15000) { // double vs int
            System.out.println("salary > 14000");
        }

        if (salary < 17000) { // double vs int
            System.out.println("salary < 17000");
        }

        if (salary <= 15000) { // double vs int
            System.out.println("salary <= 15000");
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

        int score = 80;

        // if
        // >= 90 -> A, 80 - 89 -> B, 70 - 79 -> C, 60 - 69 -> D,
        // 50 - 59 -> E, < 50 -> F

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else if (score >= 50 && score < 60) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade=" + grade);

        // Approach 2, remove upper limit

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else if (score >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Grade=" + grade);


        int score2 = 60;
        // score and score2 both >= 50, (score + score2) / 2 -> grade
        // either score or score 2 < 50 -> F
        // both score and score 2 < 50 -> F
        if (score < 50 || score2 < 50) {
            grade = 'F';
        } else {
            double averageScore = (score + score2) / 2;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else if (averageScore >= 50) {
            grade = 'E';
        }
    }
        System.out.println("Grade=" + grade);


        
    }
}

