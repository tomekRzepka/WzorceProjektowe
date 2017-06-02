package factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class MercedesCarFactor implements CarFactory {
    @Override
    public Car buildCar(String model) {
        Car car =null;
        if(model.equals("SLK")){
            Engine audiEngine = new Engine(200,3000,"diesel");
            Wheels audiWheels = new Wheels(18,"summer");
            car=new Audi("SLK",audiEngine,audiWheels);

        }else if(model.equals("A CLASS")){
            Engine audiEngine = new Engine(220,2000,"gas");
            Wheels audiWheels = new Wheels(18,"summer");
            car=new Audi("A CLASS",audiEngine,audiWheels);

        }else if(model.equals("S CLASS")){
            Engine audiEngine = new Engine(500,5000,"gas");
            Wheels audiWheels = new Wheels(18,"summer");
            car=new Mercedes("S CLASS",audiEngine,audiWheels);

        }


        return car;
    }
    }

