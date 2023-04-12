/**
 * 快速排序
 */
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 分区操作，将数组划分为左右两部分
            int pivot = partition(arr, low, high);

            // 递归排序左右两部分
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // 选择枢轴元素，这里我们选择数组中间的元素
        int pivot = arr[(low + high) / 2];

        // 初始化左右指针
        int i = low - 1;
        int j = high + 1;

        while (true) {
            // 找到左侧大于等于枢轴元素的元素
            do {
                i++;
            } while (arr[i] < pivot);

            // 找到右侧小于等于枢轴元素的元素
            do {
                j--;
            } while (arr[j] > pivot);

            // 如果左右指针相遇，则返回右指针下标
            if (i >= j) {
                return j;
            }

            // 将左侧大于等于枢轴元素的元素与右侧小于等于枢轴元素的元素交换位置
            swap(arr, i, j);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,6,7,9,8};
        quickSort(nums,0, nums.length-1);
        for (int a:nums) {
            System.out.println(a);
        }
    }

}
