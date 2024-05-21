public class Swap_oddEven_bits {
    public static int swap(int n){
        for(int i=0; i<32; i+=2){
            int i_bit = (n>>i) & 1;
            int i1_bit = (n>>(i+1)) & 1;

            n = n - (i_bit<<i) - (i1_bit<<(i+1)) + (i_bit<<(i+1)) + (i1_bit<<i);
        }
        return n;
    }
    public static void main(String[] args){
        int n = 23;
        System.out.println(swap(n));
    }
}