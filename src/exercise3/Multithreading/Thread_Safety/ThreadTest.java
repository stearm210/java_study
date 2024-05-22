package exercise3.Multithreading.Thread_Safety;

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


    }
}
