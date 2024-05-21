public class Bit_diff {
    public static void bitDiff(int a, int b){
        int XOR = a^b;
        int count = 0;
        while(XOR>0){
            if((XOR&1)==1){
                count++;
            }
            XOR = XOR>>1;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        bitDiff(a,b);
    }
}