package ThreadsManipulation;

class DaemonWorker extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Daemon Thread is running");
        }
    }
}

class NormalWorker extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker Thread finishes running");
    }
}
public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemon = new Thread(new DaemonWorker());
        Thread normalWorker = new Thread(new NormalWorker());

        //set the daemon thread to be daemon so that it will be killed when normal worker finishes running
        daemon.setDaemon(true);

        daemon.start();
        normalWorker.start();
    }
}
