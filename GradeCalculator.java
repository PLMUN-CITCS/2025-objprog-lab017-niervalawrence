import java.util.Scanner;

public class GradeCalculator {

    // Method to get the student's score from the user
    public static int getStudentScore() {
        Scanner input = new Scanner(System.in);
        int score = -1;
        
        // Ensure the score is a valid integer
        while (score < 0 || score > 100) {
            System.out.print("Enter your score (0-100): ");
            if (input.hasNextInt()) {
                score = input.nextInt();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Please enter a value between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next(); // consume the invalid input
            }
        }
        return score;
    }

    // Method to calculate the letter grade based on the score
    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        // Get the student's score
        int score = getStudentScore();
        
        // Calculate the grade based on the score
        String grade = calculateGrade(score);
        
