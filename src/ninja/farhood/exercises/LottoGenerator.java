package ninja.farhood.exercises;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    public static void main(String[] args) {

        for(int x = 0 ; x<1; x++) {
            int[] getallen = new int[6];

            for (int i = 0; i < getallen.length; i++) {
                getallen[i] = pickUniqueNumber(getallen);
            }
            Arrays.sort(getallen);
            System.out.println(Arrays.toString(getallen));
        }
    }

    public static int pickUniqueNumber(int[] bestaande) {
        int max = 42;
        Random r = new Random();

        int candidate = r.nextInt(max) + 1;
        while(alreadyPicked(bestaande, candidate)) {
            candidate = r.nextInt(max) + 1;
        }
        return candidate;
    }

    public static boolean alreadyPicked(int[] bestaande, int candidate) {
        for(int i = 0; i < bestaande.length; i++) {
            if(bestaande[i] != 0 && bestaande[i] == candidate) {
                return true;
            }
        }
        return false;
    }
}