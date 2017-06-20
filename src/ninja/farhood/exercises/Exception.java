package ninja.farhood.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert number: ");

        try {
            int number = s.nextInt();
            System.out.println("Chosen number is: " + number);
        } catch(InputMismatchException e) {
            System.out.println("ERROR: DASH DA WRONG NUMBA");
        }


    }

}
