package AutomationCICD;

import java.util.Scanner;

class TernaryOperatorCheckScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to score check");
        System.out.println("Enter your Score");
        int score = input.nextInt();
        String result = score > 80 ? "High" : (score > 50 ? "Moderate" : "Low");
        //String result = score < 50 ? "Low" : score <= 80 && score >= 50 ? "Moderate" : "High";
        System.out.println(result);

    }
}
