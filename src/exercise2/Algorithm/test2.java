package exercise2.Algorithm;

import java.util.Arrays;

//选择排序
public class test2 {
    public static void main(String[] args) {
        int[] arr={3,4,1,2,6,8};
        //这里第一个循环长度控制为进行循环几次
        //一般数组长度为4的时候，会循环3次
        for (int i = 0; i < arr.length-1; i++) {
            //i=0时，  j=1 2 3
            //i=1时，  j=2 3
            //i=2时，  j=3
            //这里的内循环表现为每一个元素选择与几个元素进行比较
            //内循环的长度为数组原长度,最大只能到3，因此可以写一个小于数组长度，或者小于等于数组下标
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
