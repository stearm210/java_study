package exercise3.Multithreading.Thread_Pool;

import java.util.concurrent.*;

/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading.Thread_Pool
 * @Project：study
 * @name：threadPoolTest3
 * @Date：23/5/2024 19:02
 * @Filename：threadPoolTest3
 */
public class threadPoolTest3 {
    public static void main(String[] args) {
        //1.创建一个线程池对象
//        ExecutorService pool=new ThreadPoolExecutor(3,5,8, TimeUnit.SECONDS,new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //1.使用Executors创建一个线程池对象
        ExecutorService pool=Executors.newFixedThreadPool(3);//有3个线程可以进行复用,最大线程数量为3

        //线程个数如何选择
        //1.计算密集型任务：核心线程数=CPU核数+1
        //2.IO密集型任务：核心线程数=CPU核数*2
    }
}
