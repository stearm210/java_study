package exercise2.Algorithm;

import java.util.Arrays;

//冒泡排序
public class test1 {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //字符串输出数组内元素
        System.out.println(Arrays.toString(arr));
    }
}
