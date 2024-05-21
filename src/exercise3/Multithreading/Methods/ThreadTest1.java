package exercise3.Multithreading.Methods;

/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading.Methods
 * @Project：study
 * @name：ThreadTest1
 * @Date：21/5/2024 16:38
 * @Filename：ThreadTest1
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        Thread t1=new MyThread("一号线程");
        //t1.setName("一号线程");
        t1.start();
        System.out.println(t1.getName());//输出线程名

        Thread t2=new MyThread("二号线程");
        //t2.setName("二号线程");
        t2.start();
        System.out.println(t2.getName());//输出线程名

        //主线程对象的名字
        //哪个线程执行它，它就会得到哪个线程对象
        Thread m=Thread.currentThread();
        m.setName("主线程");
        System.out.println(m.getName());//获得主线程对象的线程名

        for (int i = 0; i <=5; i++) {
            System.out.println(m.getName()+"线程输出"+i);
        }
    }
}
