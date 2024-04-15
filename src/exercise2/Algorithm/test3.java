package exercise2.Algorithm;

import java.util.Arrays;

//查找算法
//二分查找(折半查找)
//使用二分查找之前需要保证数组中的元素是有序地
//每次排除一半的数据，查找的性能会更好
public class test3 {
    public static void main(String[] args) {
        int[] arr={7,23,79,81,103,127,131,145};
        System.out.println(binarySearch(arr, 81));

        //Arrays中的二分查找调用方法
        System.out.println(Arrays.binarySearch(arr,81));
    }
    //二分查找算法
    public static int binarySearch(int[] arr,int data){
        int left=0;
        int right=arr.length-1;

        //定义循环，控制折半查找
        while (left<=right){
            //每次折半，算出中间位置的索引
            int mid=(left+right)/2;
            //判断当前查找的元素值与中间位置的元素的大小情况
            if(data<arr[mid]){
                //向左边查找，直到截止位置=中间位置-1
                right=mid-1;
            } else if (data>arr[mid]) {
                //向右边查找
                left=mid+1;
            }else {
                //刚好中间位置为我们需要查找的元素
                return mid;
            }
        }
        return -1;//查找失败
    }
}
