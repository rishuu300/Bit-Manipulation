public class Check_bit{
    public static void checkBit(int n, int k){
        if((n & (1<<(k-1))) != 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static void checkbit(int n, int k){
        if((n>>(k-1) & 1) != 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String[] args){
        int n = 5;
        int k = 1;
        checkBit(n,k);
        checkbit(n,k);
    }
}