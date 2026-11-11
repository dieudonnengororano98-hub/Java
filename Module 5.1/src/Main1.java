public class Main1 {
    public static void main(String[]args){

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};

        SumThread t1 = new SumThread(0, 2, numbers);
        SumThread t2 = new SumThread(1, 3, numbers);
        SumThread t3 = new SumThread(2, 4, numbers);

        t1.start();
        t2.start();
        t3.start();


        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        int totalSum = t1.getSum() + t2.getSum() + t3.getSum();
        System.out.println("total sum: " + totalSum);






    }

}
