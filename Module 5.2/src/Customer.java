public class Customer implements Runnable {
    private Ticket ticket;
    private int tickets;
    private int customerId;

    public Customer(Ticket ticket, int tickets, int customerId) {
        this.ticket = ticket;
        this.tickets = tickets;
        this.customerId = customerId;
    }

    public void run() {
        boolean reserved = ticket.reserve(tickets);

        if (reserved) {
            System.out.println("Customer " + customerId
                    + " reserved " + tickets + " tickets.");
        } else {
            System.out.println("Customer " + customerId
                    + " couldn't reserve " + tickets + " tickets.");
        }
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket(20);

        Customer customer1 = new Customer(ticket, 2, 1);
        Thread thread1 = new Thread(customer1);

        Customer customer2 = new Customer(ticket, 3, 2);
        Thread thread2 = new Thread(customer2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}