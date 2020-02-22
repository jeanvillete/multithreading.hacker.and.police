package multithreading.learning;

import java.util.Arrays;
import java.util.Random;

import static multithreading.learning.HackerThread.MAX_PASSWORD;

public class Main {
    public static void main( String[] args ) {
        Integer randomPassword = new Random().nextInt(MAX_PASSWORD);

        System.out.println("Storing password on valt; [" + randomPassword + "]");

        Vault vault = new Vault(randomPassword);

        Arrays.asList(
                new AscendingHackerThread(vault),
                new DescendingHackerThread(vault),
                new PoliceThread()
        ).stream()
                .forEach(Thread::start);
    }
}
