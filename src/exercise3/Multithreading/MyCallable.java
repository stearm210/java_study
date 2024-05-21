package exercise3.Multithreading;

/*
多线程的第三种创建方式:
利用Callable接口、FutureTask类来实现
创建任务对象
1.定义一个类实现Callable接口，重写call方法，封装要做的事情，和要返回的数据。
把Callable类型的对象封装成FutureTask(线程任务对象)。
2.把线程任务对象交给Thread对象:
3.调用Thread对象的start方法启动线程，
4.线程执行完毕后、通过FutureTask对象的的get方法去获取线程任务执行的结果。
*/


import java.util.concurrent.Callable;

/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading
 * @Project：study
 * @name：MyCallable
 * @Date：21/5/2024 16:02
 * @Filename：MyCallable
 */

/*
* 1.实现callable接口*/
public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    //线程具体的任务、操作都会通过这个call方法进行体现
    //2.重写call方法
    @Override
    public String call() throws Exception {
        //描述线程的任务，返回线程执行返回后的结果
        //需求，求1-n的和并返回
        int sum=0;
        for (int i = 0; i <=n; i++) {
            sum+=i;
        }
        return "线程求出的和为:"+sum;
    }
}
