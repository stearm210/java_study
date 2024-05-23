package exercise3.Multithreading.Thread_Pool;

import java.util.concurrent.Callable;

/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading.Thread_Pool
 * @Project：study
 * @name：MyCallable
 * @Date：23/5/2024 18:38
 * @Filename：MyCallable
 */
public class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n){
        this.n=n;
    }

    //将call方法进行重写
    @Override
    public String call() throws Exception {
        //描述线程的任务，返回线程执行返回后的结果
        //需求：求1-n的和
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        //Thread.currentThread().getName()这是获取当前线程名字的操作
        return Thread.currentThread().getName()+"线程求出了1-"+n+"的和是:"+sum;
    }
}
