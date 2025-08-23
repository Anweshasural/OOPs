import java.util.Scanner;

public class BestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = 6;
        int subjects = 4;

        // Declare and instantiate 2D array
        int[][] marks = new int[students][subjects];

        // Input marks for each student
        System.out.println("Enter marks for " + students + " students (4 subjects each):");
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++) {
                System.out.print("  Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Variables to track best student
        int bestStudentIndex = 0;
        double highestAverage = 0;

        // Calculate average for each student
        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < subjects; j++) {
                sum += marks[i][j];
            }
            double average = (double) sum / subjects;

            if (average > highestAverage) {
                highestAverage = average;
                bestStudentIndex = i;
            }
        }

        // Display best student's marks
        System.out.println("\nBest Student: Student " + (bestStudentIndex + 1));
        System.out.println("Marks:");
        for (int j = 0; j < subjects; j++) {
            System.out.println("Subject " + (j + 1) + ": " + marks[bestStudentIndex][j]);
        }
        System.out.println("Average Marks: " + highestAverage);

        sc.close();
    }
}