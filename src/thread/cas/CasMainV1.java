package thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

//원자적으로 실행
public class CasMainV1 {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start value = " + atomicInteger.get());

        boolean result1 = atomicInteger.compareAndSet(0, 1);//기대 값이 0이라면 1로 세팅
        System.out.println("result1 = " + result1 +", value = " + atomicInteger.get());

        boolean result2 = atomicInteger.compareAndSet(0, 1);//비교하고 값이 맞으면 newValue로 바꿈
        System.out.println("result2 = " + result2 +", value = " + atomicInteger.get());


    }
}
