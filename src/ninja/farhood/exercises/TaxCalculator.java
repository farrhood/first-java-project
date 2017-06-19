package ninja.farhood.exercises;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your gross monthly income: ");

        double grossMonthlyIncome = s.nextDouble();

        System.out.printf("Gross monthly income: %.2f€\n", grossMonthlyIncome);

        double socialSecurityValue = grossMonthlyIncome * 0.1307;

        System.out.printf("Social security (13.07%%): %.2f€\n", socialSecurityValue);

        double taxableIncome = grossMonthlyIncome - socialSecurityValue;

        System.out.printf("Taxable income: %.2f€\n", taxableIncome);

        double yearlyIncome = taxableIncome * 12;


        if(yearlyIncome < 8681) {

            double taxation = taxableIncome * 25/100;

            System.out.printf("Taxation: %.2f€\n", taxation);

        } else if(8680 < yearlyIncome && yearlyIncome < 12361) {

            double taxation = taxableIncome * 30/100;

            System.out.printf("Taxation: %.2f€\n", taxation);

        } else if(12360 < yearlyIncome && yearlyIncome < 20601) {

            double taxation = taxableIncome * 40/100;

            System.out.printf("Taxation: %.2f€\n", taxation);

        } else if(20600 < yearlyIncome && yearlyIncome < 37751) {

            double taxation = taxableIncome * 45/100;

            System.out.printf("Taxation: %.2f€\n", taxation);

        } else if(yearlyIncome > 37751) {

            double taxation = taxableIncome * 50/100;

            System.out.printf("Taxation: %.2f€\n", taxation);

        }

        /*
        double monthlyNetIncome = taxableIncome - taxation;

        System.out.printf("Monthly net income: %2.f€\n", );
        */

    }

}
