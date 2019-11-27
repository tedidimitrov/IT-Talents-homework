package carFactory;

public class Engine extends Component {

    public Engine() {
        super("engine ", 7);
    }

    @Override
    public void run(){
        try {
            Thread.sleep(this.timeToBuild * 1000);
            System.out.println("An engine was made for 7 sec");
        } catch (InterruptedException e) {
            System.out.println("...");
        }
    }

}
