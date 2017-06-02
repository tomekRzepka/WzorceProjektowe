package factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class AudiCarFactory implements CarFactory{

    @Override
    public Car buildCar(String model) {

        Car car =null;
        if(model.equals("a3")){
            Engine audiEngine = new Engine(200,3000,"diesel");
            Wheels audiWheels = new Wheels(18,"summer");
            car=new Audi("A3",audiEngine,audiWheels);

        }else if(model.equals("TT")){
            Engine audiEngine = new Engine(220,2000,"gas");
            Wheels audiWheels = new Wheels(18,"summer");
            car=new Audi("TT",audiEngine,audiWheels);

        }else if(model.equals("S7")){
            Engine audiEngine = new Engine(500,5000,"gas");
            Wheels audiWheels = new Wheels(18,"summer");
            car=new Audi("S7",audiEngine,audiWheels);

        }


        return car;
    }
}
