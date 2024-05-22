package exercise3.Multithreading.Thread_Synchronization.Synchronous_Code_Block;

/*
* 1.线程安全问题：主要发生在同时对某个账户进行操作时
* 2.一般来说，可能某个账户中的余额会因此出现差错*/

/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading.Thread_Safety
 * @Project：study
 * @name：ThreadTest
 * @Date：22/5/2024 14:51
 * @Filename：ThreadTest
 */
public class ThreadTest {
    public static void main(String[] args) {
        //1.创建一个账户对象，代表两个人的共享账户
        Account acc=new Account("ICBC-110",100000);

        //2.创建两个线程分别表示小明和小红，方便表示取钱操作
        //将账户传给drawThread线程类，方便调用方法
        new DrawThread(acc,"小明").start();//小明
        new DrawThread(acc,"小红").start();//小红


        Account acc1=new Account("ICBC-112",100000);
        new DrawThread(acc,"小黑").start();//小黑
        new DrawThread(acc,"小白").start();//小白
    }
}
