public class Philosopher implements Runnable {

    // The forks on either side of this Philosopher
    private Object leftFork;
    private Object rightFork;

    public Philosopher(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        // Yet to populate this method
        try {
            while (true) {

                // thinking
                doAction( ": Thinking");
                synchronized (leftFork) {
                    doAction(": Picked up left fork");
                    synchronized (rightFork) {
                        // eating
                        doAction( ": Picked up right fork - eating");

                        doAction(": Put down right fork");
                    }

                    // Back to thinking
                    doAction(": Put down left fork. Back to thinking");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }

    private void doAction(String action) throws InterruptedException {
        int timeout = ((int) (Math.random() * 10000));
        System.out.println(
                Thread.currentThread().getName() + " " + action + " Timeout for " + timeout / 1000 + " seconds");
                System.out.println();
        Thread.sleep(timeout);
    }

}
