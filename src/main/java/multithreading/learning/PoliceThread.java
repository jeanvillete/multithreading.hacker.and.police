package multithreading.learning;

import java.util.concurrent.TimeUnit;

class PoliceThread extends Thread {

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
            }
            System.out.println("Police arriving within " + i + " seconds");
        }

        System.out.println("Hacker, hands up cause police is here!");
        System.exit(0);
    }

}
