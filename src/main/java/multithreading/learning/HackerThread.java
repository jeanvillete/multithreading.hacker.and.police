package multithreading.learning;

abstract class HackerThread extends Thread {

    static final int MAX_PASSWORD = 9999;

    private Vault vault;

    HackerThread(Vault vault) {
        this.vault = vault;

        this.setName(this.getClass().getName());
        this.setPriority(Thread.MAX_PRIORITY);
    }

    @Override
    public void start() {
        System.out.println("Starting thread " + this.getName());
        super.start();
    }

    public Vault getVault() {
        return vault;
    }
}
