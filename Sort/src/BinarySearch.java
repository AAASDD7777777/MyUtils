/**
 * 二分法查找
 */
public class BinarySearch {
    public int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {  // 注意循环条件为left <= right
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }


        /**
         * 使用二分法的前提： 数组必须是有序的数组
         * 利用二分法在数组中查找target的下标，如果返回负数则说明数组中不包含target
         * @param arr
         * @param target
         * @return
         */
       /* public static int search(int[] arr,int target){
            // 明确数组的查找范围
            return search(arr, target, 0, arr.length - 1);
        }

        public static int search(int[] arr, int target, int begin, int end) {
            // 明确数组的查找范围
            while (begin <= end) {
                // 查找中间数
                int middle = (begin + end) >>> 1;
                // 利用中间数和target比较
                if (arr[middle] < target) {
                    begin = middle + 1; // begin在不断放大
                } else if (arr[middle] > target){
                    end = middle - 1; // end在不断缩小
                } else {
                    // 找到了，返回target所在下标
                    return middle;
                }
            }
            // 数组中不包含target
            return -1;
        }*/


}
