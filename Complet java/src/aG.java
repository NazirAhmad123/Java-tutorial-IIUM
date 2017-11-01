import java.util.Scanner;

public class aG {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numOfstudents = in.nextInt();
        int[] score = new int[numOfstudents];

        for (int i = 0; i < score.length; i++){
            System.out.println("Enter " + i + " score: ");
            score[i] = in.nextInt();
        }
        giveGrade(score);
    }
    public static void giveGrade (int[] scores){
        char grade;
        int best = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
            if (scores[i] >= best - 10)
                grade = 'A';
            if (scores[i] >= best - 20)
                grade = 'B';
            if (scores[i] >= best - 30)
                grade = 'C';
            if (scores[i] >= best - 40)
                grade = 'D';
            else
                grade = 'D';

            System.out.println("Student " + i + " score is " + scores[i] + " with a grade of " + grade);
        }
    }
}
