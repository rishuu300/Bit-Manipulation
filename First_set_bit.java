public class First_set_bit {
    public static void firstSetBit(int n){
        int pos = 1;
        int m = 1;
        while((n&m)==0){
            m = m<<1;
            pos++;
        }
        System.out.println(pos);
    }
    public static void main(String[] args){
        int n = 2;
        firstSetBit(n);
    }
}
