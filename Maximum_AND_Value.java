public class Maximum_AND_Value {
    public static int checkBits(int arr[], int checker) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((checker & arr[i]) == checker) {
                count++;
            }
        }
        return count;
    }

    public static int maxAND(int arr[], int N) {
        int checker = 0;
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            checker = (1 << i) | res;
            int count = checkBits(arr, checker);

            if (count >= 2) {
                res = res | checker;
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
