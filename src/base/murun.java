package base;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by lixuecheng on 2016/6/16.
 */
public class murun {
    LinkedList<String>  qu=new LinkedList<>();
    public void run() throws InterruptedException {
        ExecutorService threadPool = Executors.newCachedThreadPool();
        while (qu.size()>0){
           int a= ((ThreadPoolExecutor)threadPool).getActiveCount();
if (a<5){
    qu.poll();
    threadPool.execute(new Runnable(){

        @Override
        public void run() {

        }
    });
}else
{
    Thread.sleep(500);
}


        }
        threadPool.shutdown();
    }
}
