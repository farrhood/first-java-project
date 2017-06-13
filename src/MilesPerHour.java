// Dit is de oplossing van oefening 1.5

public class MilesPerHour {
    public static void main(String[] args) {

        double afstand = 14; // Dit is de afstand in km
        int tijd = (45 * 60) + 30; // Dit is het aantal seconden

        int aantalSecondenPerUur = 3600;

        double tijdInUren = tijd / (double)aantalSecondenPerUur;

        double kilometerPerUur = afstand / tijdInUren;

        double mijlPerUur = kilometerPerUur / 1.6; // conversie van km naar mijl

        double eindResultaat = Math.round(mijlPerUur * 100) / 100.0;

        System.out.println(eindResultaat);

        // of

        System.out.printf("%.2f", mijlPerUur);

    }

}