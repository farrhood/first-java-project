package ninja.farhood.exercises;

public class MilesPerHourConverter {
    public static double product(double afstand, double tijd) {

        int aantalSecondenPerUur = 3600;

        double tijdInUren = tijd / (double)aantalSecondenPerUur;

        double kilometerPerUur = afstand / tijdInUren;

        double mijlPerUur = kilometerPerUur / 1.6; // conversie van km naar mijl

        double eindResultaat = Math.round(mijlPerUur * 100) / 100.0;

        return eindResultaat;

    }

}
