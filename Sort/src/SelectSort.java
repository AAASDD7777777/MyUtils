import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] nums = {3,2,6,7,9,8};
        //选择排序
        for(int i = 0 ;i<nums.length-1;i++){
            //从外层循环次数设置为初始值，这样可以减少一次内层循环
            int minIndex = i;//存储当前循环获取到的最小值的一个下标数
            //循环整体的数组，比较找到最小元素的下标
            //起点为外层循环+1，因为每一次外层循环都确定第i个下标为当前最小值
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    //存储当前下标
                    minIndex = j;
                }
            }
            //若下标为最小值，则不交换
            if(i!=minIndex) {
                //将当前循环的下标位置数与最小数交换
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
