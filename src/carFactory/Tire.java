package carFactory;

public class Tire extends Component{


    public Tire() {
        super("tire", 2);
    }

    @Override
    public void run(){
        try {
            Thread.sleep(this.timeToBuild * 1000);
            System.out.println("A tire was made for 2 sec");
        } catch (InterruptedException e) {
            System.out.println("...");
        }
    }
}
