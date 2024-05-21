public class Count2_odd {
    public static void naive(int arr[]){
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++)
                if(arr[i]==arr[j])
                   count++;
            if(count%2!=0)
               System.out.print(arr[i]+" ");
        }
    }

    public static void efficient(int arr[]){
        int XOR = 0;
        int res1 = 0; int res2 = 0;
        for(int i=0; i<arr.length; i++)
            XOR = XOR ^ arr[i];
        
        int sum = XOR & (~(XOR-1));
        for(int i=0; i<arr.length; i++){
            if((arr[i]&sum)!=0)
               res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }
        System.out.print(res1+" "+res2);
    }
    public static void main(String[] args){
        int arr[] = {4, 2, 4, 5, 2, 3, 3, 1};
        naive(arr);
        efficient(arr);
    }
}
