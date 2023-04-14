import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {
    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length]; // 临时数组，用于存储排好序的元素
        mergeSort(arr, 0, arr.length - 1, temp); // 调用归并排序算法
    }

    private static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) { // 如果数组长度大于1，继续分割
            int mid = (left + right) / 2; // 计算中间位置
            mergeSort(arr, left, mid, temp); // 对左半部分进行归并排序
            mergeSort(arr, mid + 1, right, temp); // 对右半部分进行归并排序
            merge(arr, left, mid, right, temp); // 将左右半部分合并
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left; // 左半部分的起始位置
        int j = mid + 1; // 右半部分的起始位置
        int k = 0; // 临时数组的起始位置

        while (i <= mid && j <= right) { // 将左右两个有序数组合并
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) { // 将左半部分剩余元素复制到临时数组中
            temp[k++] = arr[i++];
        }

        while (j <= right) { // 将右半部分剩余元素复制到临时数组中
            temp[k++] = arr[j++];
        }

        for (i = 0; i < k; i++) { // 将临时数组中的元素复制回原数组
            arr[left + i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,2,6,7,9,8};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
