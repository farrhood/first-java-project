package ninja.farhood.exercises;

import java.util.Scanner;

public class Ex2bAgePredictor {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Geef uw naam op:");

        String naam = s.next();

        System.out.println("Geef uw leeftijd");

        int age = s.nextInt();

        System.out.println("Hello " + naam + "! Next year you will be " + (age + 1));
    }
}