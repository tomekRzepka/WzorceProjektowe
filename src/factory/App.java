package factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class App {
    public static void main(String[] args) {
        AbstractCarFactory abstractCarFactory= new AbstractCarFactory();
        Car car1 = abstractCarFactory.buildAudiCar("A 3");
        Car car2 = abstractCarFactory.buildBMWCar("X 5");
        Car car3 = abstractCarFactory.buildMercedesCar("SLK");
    }
}
