package multithreading.learning;

class Vault {

    private int password;

    Vault(int password) {
        this.password = password;
    }

    boolean isCorrectPassword(int guess) {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
        }
        return this.password == guess;
    }
}
