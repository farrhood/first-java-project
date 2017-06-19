package ninja.farhood.exercises;

import java.util.Scanner;

public class RegelVanCramer {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Geef waarden op voor a, b, c, d, e en f: ");

        /* double a = 3.4,
                b = 50.2,
                c = 2.1,
                d = 0.55,
                e = 44.5,
                f = 5.9;

        kon ook worden geschreven als
        double a = 3.4;
        double b = 50.2;
        ...
        double f = 5.9; */

        double a = s.nextDouble(),
                b = s.nextDouble(),
                c = s.nextDouble(),
                d = s.nextDouble(),
                e = s.nextDouble(),
                f = s.nextDouble();


        double x, y;
        x = (e*d - b*f) / (a*d - b*c);
        y = (a*f - e*c) / (a*d - b*c);

        /* kon ook worden geschreven als
        double x = (e*d - b*f) / (a*d - b*c);
        double y = (a*f - e*c) / (a*d - b*c);
        */

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}