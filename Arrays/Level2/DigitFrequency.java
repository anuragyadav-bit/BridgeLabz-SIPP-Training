import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        int[] digits = new int[20];
        int[] frequency = new int[10];
        int index = 0;

        while (number != 0) {
            int digit = (int)(number % 10);
            digits[index++] = digit;
            number = number / 10;
        }

        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}

