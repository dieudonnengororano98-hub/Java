public class SumThread extends Thread {

    private int [] numbers;
    private int startIndex;
    private int endIndex;
    private int sum;


    SumThread(int startIndex,int endIndex, int [] numbers){
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.numbers = numbers;
        this.sum = 0;
    }
    public void run(){
        for(int i = startIndex; i <= endIndex; i++){
                    sum = sum + numbers[i];

        }

    }
    public int getSum(){
        return sum;

    }
    public int [] getNumbers(){
        return numbers;
    }

}
