package ninja.farhood.exercises;

public class Pi {
    public static void main(String[] args) {

        int max = 1_000_000;
        int sign = 1; // (e.g. positive)
        double sum = 0;
        for(int n = 1; n <= max; n += 2) {
            sum += sign * (1.0/n);
            //System.out.printf("n=%d, sign=%d\n", n, sign);
            sign *= -1;
        }
        double closeToPi = 4 * sum;
        System.out.println("ninja.farhood.exercises.Pi = " + closeToPi);

    }
}