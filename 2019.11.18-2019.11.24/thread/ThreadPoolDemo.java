package thread;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
*使用多线程技术求和
* 两个线程，一个计算1+到100，一个计算1+到200的和
* 多线程的异步计算
*/
public class ThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //建立线程池
        ExecutorService es = Executors.newFixedThreadPool(2);

        Future<Integer> f1= es.submit(new GetSumCallable(100));
        Future<Integer> f2=es.submit(new GetSumCallable(200));

        System.out.println(f1.get());
        System.out.println(f2.get());
        es.shutdown();
    }

}
