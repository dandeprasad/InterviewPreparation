package prep.StringPrep;

public class NumberToWordsConverter {

    // Arrays to store the word representation of digits
    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    // Convert a number less than 100 to its word representation
    private static String convertLessThanHundred(int number) {
        if (number < 10) {
            return units[number];
        } else if (number < 20) {
            return teens[number - 10];
        } else {
            return tens[number / 10] + " " + units[number % 10];
        }
    }

    // Convert a number less than 1000 to its word representation
    private static String convertLessThanThousand(int number) {
        if (number == 0) {
            return "";
        } else {
            return units[number / 100] + " Hundred " + convertLessThanHundred(number % 100);
        }
    }

    // Convert a number to its word representation
    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        String result = "";

        // Convert billions
        if (number >= 1000000000) {
            result += convertLessThanThousand(number / 1000000000) + " Billion ";
            number %= 1000000000;
        }

        // Convert millions
        if (number >= 1000000) {
            result += convertLessThanThousand(number / 1000000) + " Million ";
            number %= 1000000;
        }

        // Convert thousands
        if (number >= 1000) {
            result += convertLessThanThousand(number / 1000) + " Thousand ";
            number %= 1000;
        }

        // Convert remaining hundreds
        result += convertLessThanThousand(number);

        return result.trim();
    }

    // Main method for testing
    public static void main(String[] args) {
        int number = 123456789;
        String words = convertToWords(number);
        System.out.println(number + " in words: " + words);
    }
}
