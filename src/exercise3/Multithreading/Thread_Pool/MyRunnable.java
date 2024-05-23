package exercise3.Multithreading.Thread_Pool;

/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading.Thread_Pool
 * @Project：study
 * @name：MyRunnable
 * @Date：23/5/2024 18:16
 * @Filename：MyRunnable
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        //描述任务
        System.out.println(Thread.currentThread().getName()+"==>输出666~~");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
