import java.util.Scanner;

public class minList {
    static Scanner in = new Scanner(System.in);
    public static void main(String args[]){

        System.out.println("Enter 5 numbers: ");
        int[] numbers = new int[5];
        for (int i =0; i < numbers.length; i++){
            numbers[i] = in.nextInt();
        }
        System.out.println("Smallest element is: " + returnMinElement(numbers));

    }
    public static int returnMinElement(int[] list){
        int min = list[0];

        for (int i = 0; i < list.length; i++){
            if (min > list[i]){
                min = list[i];
            }
        }
        return min;
    }
}
