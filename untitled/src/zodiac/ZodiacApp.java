package zodiac;

import java.util.Scanner;

public class ZodiacApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date (day month): ");
        int day = scanner.nextInt();
        String month = scanner.next();

        ZodiacSign zodiacSign = new ZodiacSign(day, month);

        String result = zodiacSign.computeZodiacSign();

        if (result.equals("Invalid date")) {
            System.out.println("Incorrect date! Check your input.");
        } else {
            System.out.println("Your zodiac sign is " + result);
        }

        scanner.close();
    }
}
