public class MissingNumber {

    public int missingNumber(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    
    public static int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int left = 0, right = nums.length;
        while (left < right) {
            int middle = (right - left) / 2 + left;
            if (middle == nums[middle]) { // 左边排除
                left = middle + 1;
            } else { // 右边排除
                right = middle;
            }
        }
        return left;
    }
}
