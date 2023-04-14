/**
 * 插入排序
 */
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int len = arr.length; // 数组的长度
        for (int i = 1; i < len; i++) { // 遍历整个数组
            int temp = arr[i]; // 当前元素
            int j = i - 1; // 前一个元素的下标
            while (j >= 0 && arr[j] > temp) { // 如果前一个元素比当前元素大
                arr[j + 1] = arr[j]; // 将前一个元素向右移动
                j--; // 继续比较前一个元素
            }
            arr[j + 1] = temp; // 插入当前元素
        }
    }


    public static void main(String[] args) {
        int[] nums = {3,2,6,7,9,8};
        insertionSort(nums);
        for (int a:nums) {
            System.out.println(a);
        }
    }
}
