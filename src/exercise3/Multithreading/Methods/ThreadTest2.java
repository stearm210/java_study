package exercise3.Multithreading.Methods;

/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading.Methods
 * @Project：study
 * @name：ThreadTest2
 * @Date：21/5/2024 17:00
 * @Filename：ThreadTest2
 */
public class ThreadTest2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <=5; i++) {
            System.out.println(i);
            //休眠5s
            if(i==3){
                //会让当前执行的进程暂停5s，之后继续执行
                Thread.sleep(5000);
            }
        }
    }
}
