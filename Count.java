public class Count {
    public static void naive(int n){
        int res = 0;
        while(n>0){
            if((n&1)==1)
                res++;
            n = n>>1;
        }
        System.out.println(res);
    }

    public static void brianKerningams(int n){
        int res = 0;
        while(n>0){
            n = (n & (n-1));
            res++;
        }
        System.out.println(res);
    }

    static int table[] = new int[256];
    public static void initializer(){
        table[0] = 0;
        for(int i=1; i<256; i++){
            table[i] = (i&1)  + table[i/2];
        }
    }

    public static void lookUpTable(int n){
        int res = table[n & 0xFF];//0xFF is hexadecimal representation of 8 set bits i.e 255
        n = n>>8;
        res = res + table[n & 0xFF];
        n = n>>8;
        res = res + table[n & 0xFF];
        n = n>>8;
        res = res + table[n & 0xFF];
        System.out.println(res);
    }
    public static void main(String[] args){
        int n = 13;
        naive(n);
        brianKerningams(n);
        initializer();
        lookUpTable(n);
    }
}
