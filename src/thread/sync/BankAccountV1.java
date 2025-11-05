package thread.sync;

import static java.lang.Thread.sleep;
import static util.MyLogger.log;

public class BankAccountV1 implements BankAccount{

    private int balance;// 잔고

    public BankAccountV1(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount) throws InterruptedException {
        log("거래 시작: " + getClass().getSimpleName());
        //잔고가 출금액 보다 적으면, 진행X

        log("[검증 시작] 출금액: " + amount + ", 잔액: " + balance);
        if(balance < amount){
            log("[실패] 출금액: " + amount + ", 잔액: " + balance);
            return false;
        }

        //잔고가 출금액 보다 많으면, 진행
        log("[검증 완료] 출금액: " + amount + ", 잔액: "  +balance);
        sleep(1000);//출금에 걸리는 시간
        balance = balance - amount;
        log("[출금 완료] 출금액: " + amount + ", 잔액: " + balance);

        log("거래 종료");
        return true;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
