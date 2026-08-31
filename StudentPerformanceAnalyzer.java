import java.util.Scanner;

public class StudentPerformanceAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT PERFORMANCE ANALYZER =====");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mathematics marks: ");
        double mathematics = sc.nextDouble();

        System.out.print("Enter Programming marks: ");
        double programming = sc.nextDouble();

        System.out.print("Enter English marks: ");
        double english = sc.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter Electrical marks: ");
        double electrical = sc.nextDouble();

        double total = mathematics + programming + english
                     + chemistry + electrical;

        double percentage = total / 5;

        System.out.println("\n===== RESULT =====");
        System.out.println("Student: " + name);
        System.out.println("Total: " + total + " / 500");
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
