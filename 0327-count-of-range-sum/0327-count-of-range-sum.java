class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] prefixSum = new long[nums.length + 1];
        // Step 1: Compute Prefix Sum
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        // Step 2: Use Merge Sort to count valid range sums
        return mergeSortAndCount(prefixSum, 0, prefixSum.length - 1, lower, upper);
    }

    private int mergeSortAndCount(long[] prefixSum, int left, int right, int lower, int upper) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;
        int count = mergeSortAndCount(prefixSum, left, mid, lower, upper) + 
                    mergeSortAndCount(prefixSum, mid + 1, right, lower, upper);

        // Count valid pairs where lower <= prefixSum[j] - prefixSum[i] <= upper
        int i = left, j1 = mid + 1, j2 = mid + 1;
        while (i <= mid) {
            // Find the first j1 where prefixSum[j1] - prefixSum[i] >= lower
            while (j1 <= right && prefixSum[j1] - prefixSum[i] < lower) j1++;
            // Find the first j2 where prefixSum[j2] - prefixSum[i] > upper
            while (j2 <= right && prefixSum[j2] - prefixSum[i] <= upper) j2++;
            count += (j2 - j1); // Count valid indices
            i++;
        }

        // Merge two halves while keeping them sorted
        merge(prefixSum, left, mid, right);
        return count;
    }

    private void merge(long[] prefixSum, int left, int mid, int right) {
        long[] temp = new long[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        
        while (i <= mid && j <= right) {
            if (prefixSum[i] <= prefixSum[j]) {
                temp[k++] = prefixSum[i++];
            } else {
                temp[k++] = prefixSum[j++];
            }
        }
        
        while (i <= mid) temp[k++] = prefixSum[i++];
        while (j <= right) temp[k++] = prefixSum[j++];
        
        System.arraycopy(temp, 0, prefixSum, left, temp.length);
    }
}