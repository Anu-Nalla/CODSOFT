import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total number of subjects: ");
        int n = sc.nextInt();
        
        int totalMarks = 0;
        int totalCredits = 0;
 
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for Subject " + i + " (Between 0 to 100): ");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Please enter marks between 0 to 100.");
                i--;
                continue;
            }

            System.out.print("Enter credits for Subject " + i + ": ");
            int credits = sc.nextInt();
            if (credits <= 0) {
                System.out.println("Please enter a positive number for credits.");
                i--;
                continue;
            }

            totalMarks += (marks * credits);
            totalCredits += credits;
        }

        double weightedAvg = (double) totalMarks / totalCredits;
        System.out.println("Weighted Average Percentage: " + weightedAvg + "%");

        String overallGrade = calculateOverallGrade(weightedAvg);
        System.out.println("Overall Grade: " + overallGrade);

        sc.close();
    }

    public static String calculateOverallGrade(double avgPercentage) {
        if (avgPercentage >= 90) {
            return "O (Outstanding)";
        } else if (avgPercentage >= 80) {
            return "A+ (Excellent)";
        } else if (avgPercentage >= 70) {
            return "A (Very Good)";
        } else if (avgPercentage >= 60) {
            return "B+ (Good)";
        } else if (avgPercentage >= 50) {
            return "B (Average)";
        } else if (avgPercentage >= 40) {
            return "C (Pass)";
        } else {
            return "F (Fail)";
        }
    }
}