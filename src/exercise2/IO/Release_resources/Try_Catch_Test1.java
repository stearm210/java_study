package exercise2.IO.Release_resources;

//finally中的代码最终一定会执行一次
//如果出现异常，一般会执行catch中的代码

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Release_resources
 * @Project：study
 * @name：Try_Catch_Test1
 * @Date：5/5/2024 14:46
 * @Filename：Try_Catch_Test1
 */
public class Try_Catch_Test1 {
    public static void main(String[] args) {
        try{
            System.out.println(10/2);
            return;//跳出方法的执行
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally执行了一次");
        }

        System.out.println(chu(10,2));
    }
    public static int chu(int a,int b){
        try {
            return a/b;
        }catch (Exception e){
            e.printStackTrace();
            return -1;//表示出现异常
        }finally {
            //千万不要在finally中返回数据
            //这样会导致返回的数据是不准确的
        }
    }
}
