package exercise3.Multithreading;
//线程创建方法，这种方式主要是通过继承Tread类进行创建

/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading
 * @Project：study
 * @name：ThreadTest1
 * @Date：10/5/2024 16:20
 * @Filename：ThreadTest1
 */
public class ThreadTest1 {
    //main一般是一条默认的主线程执行的
    public static void main(String[] args) {
        //3.创建一个mythread线程类对象，用其代表一个线程
        Thread t=new MyThread();
        //4.启动线程(自动执行)
        t.start();//main线程，t线程

        for (int i = 0; i <=5; i++) {
            System.out.println("主线程main输出:"+i);
        }
    }
}
