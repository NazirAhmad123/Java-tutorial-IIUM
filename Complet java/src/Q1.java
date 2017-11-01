public class Q1 {
    public static void main(String args[]){

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();

        int[] score = new int[numOfStudents];

        for(int i = 0; i < score.length; i++){
            System.out.print("Enter score " + i + " :");
            score[i] = input.nextInt();
        }

        assignGrade(score);

    }
    public static void assignGrade(int[] score){
        int best = 0;
        char grade;
        for (int i = 0; i < score.length; i++){
            if(score[i] > best){
                best = score[i];
            }
            if(score[i] >= best - 10)
                grade = 'A';
            else if (score[i] >= best - 20)
                grade = 'B';
            else if (score[i] >= best - 30)
                grade = 'C';
            else if (score[i] >= best - 40)
                grade = 'D';
            else
                grade = 'F';
            System.out.println("Student " + i + " score is " + score[i] + " and grade is " + grade);
        }
    }

}
