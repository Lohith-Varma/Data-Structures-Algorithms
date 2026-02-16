public class SuffixSum {
    public static void main(String[] args) {
        int[] nums = {15, 10, 25, 5, 10, 20};
        
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        
        int[] suffixSum = new int[nums.length];
        suffixSum[0] = sum;
        for(int i=1; i<nums.length; i++) {
            suffixSum[i] = suffixSum[i-1] - nums[i-1];
        }
        for(int i=0; i<nums.length; i++) {
            System.out.print(suffixSum[i]+" ");
        }   
    }
}
