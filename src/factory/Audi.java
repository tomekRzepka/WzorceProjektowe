package factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class Audi implements Car {
    private Wheels wheels;
    private Engine engine;
    private String model;
    public  Audi (String model,Engine engine,Wheels wheels){
        this.engine = engine;
        this.wheels = wheels;
        this.model = model;
    }
    @Override
    public void drive() {
        System.out.println("Driving with AUDI");
        System.out.println("Engine"+ engine.toString());
        System.out.println("Wheels"+ wheels.toString());

    }
}
