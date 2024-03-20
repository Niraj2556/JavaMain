package testing;
import java.util.Scanner;

public class binary_to_decimal {
        public static void main(String[] args) {
            int binaryNumber, decimalNumber = 0, i = 0, remainder;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a binary number: ");
            binaryNumber = input.nextInt();
            while (binaryNumber != 0) {
                remainder = binaryNumber % 10;
                binaryNumber /= 10;
                decimalNumber += remainder * Math.pow(2, i);
                ++i;
            }
            System.out.println("Decimal Number = " + decimalNumber);
        }
    }

