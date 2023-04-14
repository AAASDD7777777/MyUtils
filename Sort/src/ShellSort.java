import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        int gap = n / 2; // 初始间隔为数组长度的一半
        while (gap > 0) { // 循环遍历不同的子序列
            // 对每个子序列进行插入排序
            for (int i = gap; i < n; i++) {
                int temp = arr[i]; // 保存当前元素的值
                int j = i;
                // 将子序列中的元素与它前面的元素进行比较
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap]; // 将前面的元素向后移动 gap 个位置
                    j -= gap;
                }
                arr[j] = temp; // 将待排序的元素插入到正确的位置
            }
            gap /= 2; // 缩小子序列的间隔
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,2,6,7,9,8};
        shellSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}