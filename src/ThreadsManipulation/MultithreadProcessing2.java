package ThreadsManipulation;

class RunT1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runner1 " + i);
        }
    }
}

class RunT2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Runner2 " + i);
        }
    }
}

public class MultithreadProcessing2 {
    public static void main(String[] args) {
        Thread t1 = new RunT1();
        Thread t2 = new RunT2();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish the threads");
    }
}
