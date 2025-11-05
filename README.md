🧠 Java Advanced & Concurrency Study

개념은 직접 구현해봐야 진짜 내 것이 된다.
자바의 고급 개념(멀티스레드, 동기화, volatile, 람다, 예외처리 등)을
코드로 실험하며 정리한 개인 학습 레포지토리입니다.

🗂️ 프로젝트 구조
java-adv1/
 ┣ src/
 ┃ ┣ thread/
 ┃ ┃ ┣ start/       → Thread, Runnable 기본
 ┃ ┃ ┣ control/     → join, yield, sleep, interrupt
 ┃ ┃ ┣ sync/        → synchronized, 임계영역
 ┃ ┃ ┣ bounded/     → 생산자-소비자, wait/notify, Lock
 ┃ ┃ ┗ volatile1/   → volatile, 메모리 가시성
 ┃ ┗ util/          → Logger, Utils 등 공통 도구
 ┗ Main.java         → 실행 진입점


각 폴더는 독립적인 실습 단위이며,
예제를 실행하면 콘솔 로그로 스레드 동작을 시각적으로 확인할 수 있습니다.

⚙️ 실습 개요
분류	학습 주제	주요 포인트
🧵 Thread	Thread, Runnable, join, yield	기본 스레드 동작 원리
🧭 Control	sleep(), interrupt()	스레드 제어와 종료
🔒 Sync	synchronized, 임계영역	경쟁 조건 방지
🧺 Bounded Queue	wait() / notify(), ReentrantLock	생산자-소비자 패턴
💨 Volatile	volatile, CPU 캐시 불일치	가시성 보장 실험
🧰 Util	MyLogger, ThreadUtils	재사용 가능한 유틸 정리
