package multithreading.learning;

class AscendingHackerThread extends HackerThread {

    AscendingHackerThread(Vault vault) {
        super(vault);
    }

    @Override
    public void run() {
        for (int guess = 0; guess < MAX_PASSWORD; guess ++) {
            if (getVault().isCorrectPassword(guess)) {
                System.out.println(this.getName() + " guessed the password, which was; " + guess);
                System.exit(0);
            }
        }
    }
}
