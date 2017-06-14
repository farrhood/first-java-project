import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Input employee name: ");

        String employeeName = s.next();

        System.out.println("Input number of hours worked: ");

        double numberOfHoursWorked = s.nextDouble();

        System.out.println("Input hourly rate: ");

        double hourlyRate = s.nextDouble();

        double grossPay = numberOfHoursWorked * hourlyRate;

        if(numberOfHoursWorked > 40) {

            grossPay = (numberOfHoursWorked * hourlyRate) + ((numberOfHoursWorked - 40) * hourlyRate * 1.5);

        }

        System.out.println(employeeName + " made $" + grossPay);

    }

}
