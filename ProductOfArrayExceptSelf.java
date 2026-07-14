public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int n = nums.length;

        int[] result = new int[n];

        int left = 1;

        for(int i = 0; i < n; i++){
            result[i] = left;
            left *= nums[i];
        }

        int right = 1;

        for(int i = n - 1; i >= 0; i--){
            result[i] *= right;
            right *= nums[i];
        }

        for(int num : result)
            System.out.print(num + " ");
    }
}