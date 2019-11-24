/**
 * @program: person-demo
 * @description: 快排
 * @author: jijiang
 * @create: 2019-11-23 15:00
 **/

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[]array=new int[] {49,38,65,97,76,13,27,49};
        quickSort(array, 0, array.length-1);
    }
    public static void quickSort(int[]array,int low,int high) {
        if(low<high) {
            int mid=partition(array, low, high);  //取得分区结果
            quickSort(array, low, mid-1);
            quickSort(array, mid+1, high);
        }
    }


    //分区

    public static int partition(int[]array ,int low,int high) {
        //1 取得关键key
        //2 设置 左右下标  i=0    j=length-1;
        // 把数组中的第一个元素作为关键字
        int key=array[low];
        int i=low, j=high;
        if(low<high) {
            //从J开始向左找
            while(i<j) {
                while(i<j&&array[j]>=key) {
                    j--;
                }
                if(i<j) {
                    array[i]=array[j];
                    i++;
                }
                while(i<j&&array[i]<=key) {
                    i++;
                }
                if(i<j) {
                    array[j]=array[i];
                    j--;
                }
            }
            array[i]=key;
            System.out.println("每次排序的结果="+Arrays.toString(array));
        }
        return i;
    }
}



