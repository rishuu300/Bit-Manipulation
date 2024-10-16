public class Swap_all_odd_and_even_bits {
    public static int swapBits(int n) {
        // Hexadecimal Representation of 5 is 0101.
        // So, 8 times 5 is 32 bits of odd places as set bits.
        int oddMask = 0x55555555;

        // Hexadecimal representation of 10 is A which is 1010.
        // So, 8 timmes A is 32 bits of even places as set bits.
        int evenMask = 0xAAAAAAAA;

        int oddBits = (n & oddMask);
        int evenBits = (n & evenMask);

        oddBits = oddBits << 1;
        evenBits = evenBits >> 1;

        return (oddBits | evenBits);
    }

    public static void main(String[] args) {

    }
}
