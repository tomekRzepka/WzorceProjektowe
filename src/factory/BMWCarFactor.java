package factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class BMWCarFactor implements CarFactory {
    @Override
    public Car buildCar(String model) {

            Car car =null;
            if(model.equals("Q 5")){
                Engine audiEngine = new Engine(200,3000,"diesel");
                Wheels audiWheels = new Wheels(18,"summer");
                car=new BMW("Q 5",audiEngine,audiWheels);

            }else if(model.equals("X 5")){
                Engine audiEngine = new Engine(220,2000,"gas");
                Wheels audiWheels = new Wheels(18,"summer");
                car=new BMW("X 5",audiEngine,audiWheels);

            }else if(model.equals("M 5")){
                Engine audiEngine = new Engine(500,5000,"gas");
                Wheels audiWheels = new Wheels(18,"summer");
                car=new BMW("M 5",audiEngine,audiWheels);

            }


            return car;
        }
    }

