public class TelevisionViewer {
    public static void main (String[] args){
        Television myTV = new Television();
        myTV.setChannel(1);

        for(int day = 1; day <= 10; day++){
            System.out.println("woke up, day " + day);

            boolean tired = false;

            if (!myTV.isOn());
            myTV.pressOnOff();

            while (!tired) {
                System.out.println("Whatching channel" + myTV.getChannel());
                myTV.setChannel(myTV.getChannel() + 1);

                if (myTV.getChannel() % 4 == 0)
                    tired = true;
            }
            myTV.pressOnOff();
            System.out.println("falling asleep");

        }
    }
}
