package ninja.farhood.exercises.homeandlearn;
import java.util.Scanner;

public class NameSwapper {

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter a First Name and a Surname: ");
        String FullName = user_input.nextLine();

        System.out.println("Old name: " + FullName);

        // String FullName = "Bill Gates";

        String FirstNameChars = "";
        FirstNameChars = FullName.substring(0 ,2);

        // System.out.println(FirstNameChars);

        int spacePos = FullName.indexOf(" ");

        // System.out.println("Space is at position " + spacePos);

        String SurNameChars = "";
        SurNameChars = FullName.substring( spacePos + 1, (spacePos + 1) + 2 );

        // System.out.println(SurNameChars);

        String OtherFirstChars = "";
        OtherFirstChars = FullName.substring(2, spacePos);

        // System.out.println("other first: " + OtherFirstChars);

        String OtherSurNameChars = "";
        OtherSurNameChars = FullName.substring((spacePos + 1) + 2, FullName.length() );

        // System.out.println("other second: " + OtherSurNameChars);

        String NewName = "";
        NewName = SurNameChars + OtherFirstChars + " " + FirstNameChars + OtherSurNameChars;
        System.out.println("New name: " + NewName);
    }
}
