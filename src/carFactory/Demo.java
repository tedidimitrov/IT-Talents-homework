package carFactory;


import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Demo {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(new Tire());
        pool.execute(new Tire());
        pool.execute(new Tire());

        pool.execute(new Tire());
        pool.execute(new Seat());
        pool.execute(new Seat());

        pool.execute(new Seat());
        pool.execute(new Seat());
        pool.execute(new Seat());

        pool.execute(new Engine());
        pool.execute(new Frame());

        pool.shutdown();

    }

}
