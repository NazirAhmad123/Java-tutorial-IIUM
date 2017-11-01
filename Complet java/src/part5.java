import java.util.Scanner;

public class part5 {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]){
        // write your code here
        //System.out.print("Hello world!");
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        diplayMyName(name);
    }
    public static void diplayMyName(String name){
        System.out.print("your name is " + name);
    }
}
