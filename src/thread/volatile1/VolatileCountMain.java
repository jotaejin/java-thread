package thread.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

/**
 * 한 스레드에서 변경한 값을 다른 스레드로 즉시 볼 수 있음 : 메모리 가시성
 */
public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        t.start();

        sleep(1000);//컨텍스트 스위칭 될 때 캐시 메모리 갱신

        task.flag = false;
        log("flag = " + task.flag + ", count = " + task.count + " in main");
    }

    static class MyTask implements Runnable{
        volatile boolean flag = true;
        volatile long count;


        @Override
        public void run() {
            while (flag){
                count++;
                if(count % 100_100_100 == 0){
                    log("flag = " + flag + ", count = " + count + " in while()");
                }
            }
            log("flag = " + flag + ", count = " + count + " 종료");
        }
    }
}
