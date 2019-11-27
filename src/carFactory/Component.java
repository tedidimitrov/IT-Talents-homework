package carFactory;

public abstract class Component implements Runnable{

    private String name;
    protected int timeToBuild;

    public Component(String name, int timeToBuild) {
        this.name = name;
        this.timeToBuild = timeToBuild;
    }


}
