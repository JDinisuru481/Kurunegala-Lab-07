import java.util.Scanner;

public class IT26100481Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");

            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += scanner.nextInt();
            }

            double average = sum / 4.0;
            System.out.println("Average is : " + average);

            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Overall Grade is : " + grade);
            System.out.println(); // Blank line between students
        }

        scanner.close();
    }
}	  
		  