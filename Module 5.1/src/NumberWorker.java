class NumberWorker extends Thread {
    private String name;
    private int start;
    private int end;

    NumberWorker(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i += 2) {
            System.out.println(name + " Thread: " + i);
        }
    }
}

public class ParallelPrinter {
    public static void main(String[] args) throws InterruptedException {
        int max = 20;

        NumberWorker odd = new NumberWorker("Odd", 1, max);
        NumberWorker even = new NumberWorker("Even", 2, max);

        odd.start();
        even.start();

        odd.join();
        even.join();

        System.out.println("Printing complete.");
    }
}