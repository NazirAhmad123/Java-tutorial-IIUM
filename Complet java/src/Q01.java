import java.util.Scanner;
public class Q01 {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]){

        System.out.println("Enter the number of students: ");
        int numOfStudents = input.nextInt();

        int[] score = new int[numOfStudents];

        for (int i = 0; i <= score.length; i++){
            System.out.print("Enter the " + i + "th student's grade: ");
            score[i] = input.nextInt();
        }
        assignGrades(score);


    }
    public static void assignGrades(int[] score){
        int best = 0;
        char grade;

        for (int i = 0; i < score.length; i++){
            if(score[i] > best){
                best = score[i];
            }

            if (score[i] > best - 10)
                grade = 'A';
            else if (score[i] > best - 20)
                grade = 'B';
            else if (score[i] > best - 30)
                grade = 'C';
            else if (score[i] > best - 40)
                grade = 'D';
            else
                grade = 'F';

            System.out.println(i + "th student's score is " + score[i] + " and grade is " + grade);
        }
    }
}
