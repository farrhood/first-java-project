package ninja.farhood.exercises.homeandlearn;

public class HandL1 {

    public static void main(String[] args) {

        String notes = "ABCDEFG";

        String firstStep = notes.substring(2, notes.length());

        String secondStep = notes.substring(0,2);

        System.out.println("The key of C is: " + firstStep + secondStep);


    }
}
