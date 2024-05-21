public class Rightmost{
    public static void rightmost(int m, int n){
        int pos = 1;
        int i = 1;
        while((m&i)==(n&i)){
            pos++;
            i = (i<<1);
        }
        System.out.println(pos);
    }
    public static void main(String[] args){
        rightmost(52,4);
    }
}
