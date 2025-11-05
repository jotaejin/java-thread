package thread.sync;

public interface BankAccount {

    boolean withdraw(int amount) throws InterruptedException;//촐금

    int getBalance();//계좌 잔액 반환
}
