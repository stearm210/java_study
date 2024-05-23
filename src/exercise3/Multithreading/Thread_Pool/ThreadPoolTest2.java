package exercise3.Multithreading.Thread_Pool;

import java.util.concurrent.*;

/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading.Thread_Pool
 * @Project：study
 * @name：ThreadPoolTest2
 * @Date：23/5/2024 18:34
 * @Filename：ThreadPoolTest2
 */
public class ThreadPoolTest2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.创建一个线程池对象的方法
        ExecutorService pool=new ThreadPoolExecutor(3,5,8, TimeUnit.SECONDS,new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //2.使用线程处理Callable任务
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
    }
}
