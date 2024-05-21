public class Power_set {
    public static void powerSet(String str){
        int powerSize = (int)Math.pow(2,str.length());
        for(int i=0; i<powerSize; i++){
            for(int j=0; j<str.length(); j++){
                if((i&(1<<j))!=0){
                   System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        powerSet(str);
    }
}
