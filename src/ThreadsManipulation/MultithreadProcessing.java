package ThreadsManipulation;

class Run1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner1 " + i);
        }
    }
}

class Run2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner2 " + i);
        }
    }
}

public class MultithreadProcessing {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Run1());
        Thread t2 = new Thread(new Run2());

        t1.start();
        t2.start();

    }
}
