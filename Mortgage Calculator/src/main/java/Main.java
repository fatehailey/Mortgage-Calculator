import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int monthInYear= 12;
        int percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / percent/ monthInYear;

        System.out.println("Period (Years): ");
        int years = scanner.nextInt();
        int numberOfPayments = years * monthInYear;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)/ (Math.pow(1+ monthlyInterest, numberOfPayments)));

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));

    }
}


