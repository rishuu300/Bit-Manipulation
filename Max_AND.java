public class Max_AND {
    public static void naive(int arr[]){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                if((arr[i]&arr[j])>max && i!=j){
                    max = arr[i]&arr[j];
                }
            }
        }
        System.out.println(max);
    }


    
    public static int checkBits(int arr[], int checker){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if((checker & arr[i]) == checker){
                count++;
            }
        }
        return count;
    }
    public static void efficient(int arr[], int N) {
        int checker = 0;
        int res = 0;
        for(int i=31; i>=0; i--){
            checker = (1<<i) | res;
            int count = checkBits(arr, checker);
            
            if(count>=2){
                res = res | checker;
            }
        }
        
        System.out.println(res);
    }
    public static void main(String[] args){
        int arr[] = {4,6,7,2,9};
        naive(arr);
        efficient(arr,arr.length);
    }
}
