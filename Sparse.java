public class Sparse {
    public static boolean naive(int n){
        while(n>0){
            int i = n&1;
            n = n>>1;
            int j = n&1;
            if(i==1 && j==1)
                return false;
        }
        return true;
    }

    public static boolean efficient(int n){
        if((n&(n>>1))>=1)
           return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(naive(3));
        System.out.println(efficient(3));
    }
}
