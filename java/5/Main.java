class TimeThread implements Runnable {
    private Thread thread;
    private String name;
    private int lengthInSec;

    TimeThread(String name, int lengthInSec) {
        this.name = name;
        this.lengthInSec = lengthInSec;
        System.out.println("Creating " + this.name );
    }

    public void run() {
        System.out.println("Running " + this.name);
        try {
            for(int i = this.lengthInSec; i > 0; i--) {
                System.out.println("Thread " + this.name + " ending in " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + this.name + " interrupted.");
        }
        System.out.println("Thread " + this.name + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + this.name);
        if (this.thread == null) {
            this.thread = new Thread(this, this.name);
            this.thread.start();
        }
    }
};

public class Main {

    public static void main(String args[]) {

        TimeThread R1 = new TimeThread("Thread-1", 5);
        R1.start();

        TimeThread R2 = new TimeThread("Thread-2", 1);
        R2.start();
    }
};