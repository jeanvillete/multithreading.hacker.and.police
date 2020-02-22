package multithreading.learning;

class DescendingHackerThread extends HackerThread {

    DescendingHackerThread(Vault vault) {
        super(vault);
    }

    @Override
    public void run() {
        for (int guess = MAX_PASSWORD; guess >= 0; guess --) {
            if (getVault().isCorrectPassword(guess)) {
                System.out.println(this.getName() + " guessed the password, which was; " + guess);
                System.exit(0);
            }
        }
    }
}
