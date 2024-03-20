package testing;

public class bakchodTest {
    public static int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int binaryRepresentation = 0b110101; // Binary literal

//        System.out.println(binaryRepresentation);
        int result = hammingWeight(binaryRepresentation);
        System.out.println("The Hamming weight of " + Integer.toBinaryString(binaryRepresentation) + " is " + result);
    }
}
