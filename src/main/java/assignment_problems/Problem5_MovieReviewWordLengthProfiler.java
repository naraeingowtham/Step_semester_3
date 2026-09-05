package assignment_problems;

import java.util.Scanner;

public class Problem5_MovieReviewWordLengthProfiler {
    static void classifyWordLengths(String review) {
        String[] words = review.trim().split("\\s+");
        int shortWords = 0, mediumWords = 0, longWords = 0;
        for (String word : words) {
            int length = word.length();
            if (length <= 4) shortWords++;
            else if (length <= 8) mediumWords++;
            else longWords++;
        }
        System.out.println("Short: " + shortWords + " | Medium: " + mediumWords + " | Long: " + longWords);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie review: ");
        String review = sc.nextLine();
        if (review.trim().isEmpty()) System.out.println("Short: 0 | Medium: 0 | Long: 0");
        else classifyWordLengths(review);
        sc.close();
    }
}
