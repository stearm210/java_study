package exercise1.Arrays_Method;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class test1 {
    public static void main(String[] args) {
        //1.返回数组的内容,返回字符串形式
        int[] arr={10,20,30,40,50,60};
        System.out.println(Arrays.toString(arr));

        //2.拷贝数组,将数组中的一部分拷贝到其他数组
        int[] arr2=Arrays.copyOfRange(arr,1,4);
        System.out.println(Arrays.toString(arr2));

        //3.拷贝数组，指定新数组的长度
        int[] arr3=Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr3));

        //4.原数组数据改变，放到新数组中
        double[] prices={99.8,128,100};
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                //value是对应的索引
                return prices[value]*0.8;//对应索引数据返回原数组
            }
        });
        System.out.println(Arrays.toString(prices));

        //5.排序方法
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
    }
}
