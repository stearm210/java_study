package exercise2.IO.File;

public class FileTest5_2 {
    public static void main(String[] args) {
        System.out.println("5的阶乘是"+f(5));
    }
    public static int f(int n){
        //终结点
        if(n==1){
            return 1;
        }else {
            return f(n-1)*n;
        }
    }

    //递加算法
    public static int f2(int x){
        if (x == 1) {
            return 1;
        }else {
            return f2(x-1)+x;
        }
    }

    //猴子吃桃问题
    //递归主要是写出公式计算过程
    //这里的主要公式是： f(x)-f(x)/2-1=f(x+1)
    //f(x)代表当天的吃桃个数，f(x+1)表示第二天的吃桃个数
}
