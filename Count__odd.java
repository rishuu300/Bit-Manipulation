public class Count__odd {
    public static void naive(int arr[]){
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j])
                   count++;
            }
            if(count%2!=0)
               System.out.println(arr[i]);
        }
    }

    public static void efficient(int arr[]){
        int res = 0;
        for(int i=0; i<arr.length; i++){
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,4,5,5};
        naive(arr);
        efficient(arr);
    }
}
