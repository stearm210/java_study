package exercise3.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading
 * @Project：study
 * @name：ThreadTest3
 * @Date：21/5/2024 16:02
 * @Filename：ThreadTest3
 */
public class ThreadTest3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //3.创建一个Callable对象
        Callable<String> call=new MyCallable(100);
        //4.将Callable的对象封装成一个FutureTask对象（任务对象）
        //(1)是一个任务对象，实现了Runnable对象
        //(2)可以在线程执行完毕以后，用未来任务对象调用get方法获取线程执行完毕之后的结果
        FutureTask<String> fl = new FutureTask<>(call);

        //5.将任务对象交给一个线程Thread对象
        new Thread(fl).start();

        //6.获取线程执行完毕之后的返回结果
        String rs=fl.get();
        System.out.println(rs);
    }
}
