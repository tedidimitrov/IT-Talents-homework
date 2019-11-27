package carFactory;

public class Frame extends Component {

    public Frame() {
        super("frame ", 5);
    }

    @Override
    public void run(){
        try {
            Thread.sleep(this.timeToBuild * 1000);
            System.out.println("A frame was made for 5 sec");
        } catch (InterruptedException e) {
            System.out.println("...");
        }
    }

}
