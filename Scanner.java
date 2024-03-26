import java.util.Scanner;

public class RomanNumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the Roman number: ");
        String input = scanner.nextLine();
        scanner.close();
        convertRomanNumber(input);
    }

    public static void convertRomanNumber(String input) {
        int number = 0;
        switch (input) {
            case "I":
                number = 1;
                break;
            case "II":
                number = 2;
                break;
            case "III":
                number = 3;
                break;
            case "IV":
                number = 4;
                break;
            case "V":
                number = 5;
                break;
            case "VI":
                number = 6;
                break;
            default:
                System.out.println("Unknown Number.");
                return;
        }
        System.out.println("It is " + convertNumberToWord(number) + ".");
    }

    public static String convertNumberToWord(int number) {
        String word = "";
        switch (number) {
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
        }
        return word;
    }
}