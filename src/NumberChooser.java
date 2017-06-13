import java.util.Scanner;

public class NumberChooser {
    public static void main(String[] args) {

        System.out.println("Geef een getal op: ");

        Scanner s = new Scanner(System.in);

        int getal = s.nextInt();

        if(getal > 10) {

            System.out.println("BIG NUMBER");

        } else if(getal > 5) {

            System.out.println("SMALL NUMBER");

        } else {

            System.out.println("INSIGNIFCANT NUMBER");

        }

    }

}

