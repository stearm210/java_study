package exercise3.Multithreading;

/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading
 * @Project：study
 * @name：ThreadTest2_1
 * @Date：21/5/2024 15:23
 * @Filename：ThreadTest2_1
 */

//匿名内部类写法进行进程的创建
public class ThreadTest2_1 {
    public static void main(String[] args) {
        //1.直接创建Runnable接口的匿名内部类形式（任务对象）
        Runnable target=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <=5 ; i++) {
                    System.out.println("子线程1输出： "+i);
                }
            }
        };
        new Thread(target).start();

        for (int i = 0; i <=5; i++) {
            System.out.println("主线程main输出:"+i);
        }
    }
}
