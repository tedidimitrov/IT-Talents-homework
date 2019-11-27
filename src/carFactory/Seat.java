package carFactory;

public class Seat extends Component {

    public Seat() {
        super("seat ", 3);
    }

    @Override
    public void run(){
        try {
            Thread.sleep(this.timeToBuild * 1000);
            System.out.println("A seat was made for 3 sec");
        } catch (InterruptedException e) {
            System.out.println("...");
        }
    }
}
