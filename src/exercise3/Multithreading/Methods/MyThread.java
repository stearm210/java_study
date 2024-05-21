package exercise3.Multithreading.Methods;

/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading.Methods
 * @Project：study
 * @name：MyThread
 * @Date：21/5/2024 16:38
 * @Filename：MyThread
 */
public class MyThread extends Thread{
    //调用构造器的方法对线程进行改名
    public MyThread(String name){
        super(name);//调用父类
    }
    @Override
    public void run(){
        for (int i = 0; i <=3; i++) {
            System.out.println("子线程输出:"+i);
        }
    }
}
