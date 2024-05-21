public class Longest_ones {
    public static void longestOnes(int n){
        int count = 0;
        while(n>0){
            n = (n&(n<<1));//It removes one set bit each time from longest continues set bits
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        longestOnes(3);
    }
}
