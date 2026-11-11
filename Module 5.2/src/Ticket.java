
public class Ticket {
    private int seats;
    private int customer;
    private  int ticket;

    public Ticket(int seats) {
        this.seats = seats;
    }
    public  synchronized boolean reserve(int ticket){

        if (seats >= ticket){
            seats=seats - ticket;
            return true;

        } else{
            return false;
        }
    }

}