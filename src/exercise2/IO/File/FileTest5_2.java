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
}
