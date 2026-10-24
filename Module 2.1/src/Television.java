public class Television{
     private boolean on;
     private int channel;

     public Television(){
         on = false;
         channel = 1;
     }

     public boolean isOn(){
         return on;
     }

     public void pressOnOff(){
         on = !on;
     }

     public int getChannel(){
         return channel;
     }

     public void setChannel(int newChannel){
         if (on){
             if(newChannel > 10){
                 channel = 1;
             } else{
                 channel = newChannel;
             }
         }

     }



}