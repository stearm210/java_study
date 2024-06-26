package exercise3.Multithreading;

/*
* Runnable主要实现过程
* 1.定义一个线程任务类MyRunnable实现Runnable接口，重写run方法
* 2.创建MyRunnable任务对象
* 3.将MyRunnable任务对象交给Thread处理
* 4.使用start()启动线程
* */









/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading
 * @Project：study
 * @name：MyRunnable
 * @Date：21/5/2024 15:09
 * @Filename：MyRunnable
 */

/*
* 1.定义一个任务类，主要实现Runnable接口
* */
public class MyRunnable implements Runnable{
    //2重写run方法
    //线程的主要执行任务
    @Override
    public void run() {
        for (int i = 0; i <=5; i++) {
            System.out.println("子线程输出==="+i);
        }
    }
    

}
