package thread.bounded;

public interface BoundedQueue {//버퍼 역할의 Queue
    void put(String data);//버퍼에 데이터 보관(생산자 스레드가 호출)

    String take();//버퍼에 보관된 값을 가져감(소비자 스레드가 호출)
}
