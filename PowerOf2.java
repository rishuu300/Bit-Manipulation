public class PowerOf2 {
    public static boolean powerOf2(int n){
        if(n!=0 && ((n &(n-1))==0))
            return true;
        return false;
    }
    public static void main(String[] args){
        int n = 6;
        System.out.println(powerOf2(n));
    }
}
