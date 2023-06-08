class QuickThread extends Thread {
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

class Main {

    public static void main(String[] args) {
        QuickThread thread = new QuickThread();
        thread.start();
    }

};