package exercise3.Multithreading;

/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading
 * @Project：study
 * @name：MyThread
 * @Date：10/5/2024 16:21
 * @Filename：MyThread
 */

/*
* 1.让子类继承Thread线程类
* */
public class MyThread extends Thread{
    //2.必须重写Thread类中的run方法
    //重写这个run方法主要是表示这个线程主要想干什么
    @Override
    public void run(){
        //描述线程的执行任务
        for (int i = 0; i <= 5; i++) {
            System.out.println("子线程MyThread输出:"+i);

        }
    }
}

