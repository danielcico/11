package zodiac;

public class ZodiacSign {
    private int day;
    private String month;

    // Constructor to initialize the day and month of the ZodiacSign object
    public ZodiacSign(int day, String month) {
        this.day = day;
        this.month = month;
    }

    // Method to compute the zodiac sign based on the entered day and month
    public String computeZodiacSign() {
        // Check if the entered date is valid
        if (isValidDate()) {
            // Use a switch statement to determine the zodiac sign based on the month and day
            switch (month) {
                case "January":
                    return (day <= 20) ? "Capricorn" : "Aquarius";
                case "February":
                    return (day <= 19) ? "Aquarius" : "Pisces";
                case "March":
                    return (day <= 20) ? "Pisces" : "Aries";
                case "April":
                    return (day <= 20) ? "Aries" : "Taurus";
                case "May":
                    return (day <= 21) ? "Taurus" : "Gemini";
                case "June":
                    return (day <= 21) ? "Gemini" : "Cancer";
                case "July":
                    return (day <= 23) ? "Cancer" : "Leo";
                case "August":
                    return (day <= 23) ? "Leo" : "Virgo";
                case "September":
                    return (day <= 23) ? "Virgo" : "Libra";
                case "October":
                    return (day <= 23) ? "Libra" : "Scorpio";
                case "November":
                    return (day <= 22) ? "Scorpio" : "Sagittarius";
                case "December":
                    return (day <= 21) ? "Sagittarius" : "Capricorn";
                default:
                    return "Invalid month";
            }
        } else {
            return "Invalid date";
        }
    }

    // Method to check if the entered date is valid
    private boolean isValidDate() {
        // Check if the day is within the valid range (1-31)
        if (day < 1 || day > 31) {
            return false;
        }

        // Array of valid month names
        String[] validMonths = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        // Check if the entered month is one of the valid months
        for (String validMonth : validMonths) {
            if (month.equals(validMonth)) {
                return true;
            }
        }

        // If the month is not valid
        return false;
    }
}
