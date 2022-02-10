package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Integers {

    /*
    QUESTION


     */

    /**
     * Prompt the user to enter numbers
     * the numbers are received as a string using nextline
     * The numbers are splitted into an array using the .split method and the condition for splitting is a space.
     * The array resulting from the splitting is iterated through
     * And the pringting is done from index 1
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Enter the integers");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String [] numberListArray = a.split(" ");
        System.out.println(Arrays.toString(numberListArray));
        int n = numberListArray.length;

        for (int i = 1; i < n; i++) {
            System.out.println(numberListArray[i]);
        }



    }
}
