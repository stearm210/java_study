package exercise3.Multithreading;


/*
* 1.创建多线程的第二种方式,实现Runable接口
*
*
* */


/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading
 * @Project：study
 * @name：ThreadTest2
 * @Date：21/5/2024 15:07
 * @Filename：ThreadTest2
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        //3.创建任务对象,创建一个新的myrunnable对象
        Runnable target=new MyRunnable();

        //4.将任务对象交给一个线程对象进行处理。转化为一个线程，方便调用start方法，对任务进行调用
        new Thread(target).start();

        for (int i = 0; i <=5; i++) {
            System.out.println("主线程main输出==="+i);
        }
    }
}
