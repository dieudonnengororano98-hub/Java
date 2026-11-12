public class Safe {
    public static void main(String[] args) throws InterruptedException {
        SafeList list = new SafeList();
 
        Thread a = new Thread(new Worker(list, 1000));
        Thread b = new Thread(new Worker(list, 1000));

        a.start();
        b.start();

        a.join();
        b.join();

        System.out.println("Size: " + list.size());
    }
}
