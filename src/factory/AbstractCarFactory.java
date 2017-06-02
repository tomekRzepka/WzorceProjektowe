package factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENT on 2017-06-02.
 */
public class AbstractCarFactory {

    private Map<CarFactoriesEnums, CarFactory> factories;

    public AbstractCarFactory() {
        this.factories = new HashMap<>();
        initFactories();
    }

    public Car buildAudiCar(String model){
       return builCar(CarFactoriesEnums.AUDI,model);
    }

    public Car buildBMWCar(String model){
       return builCar(CarFactoriesEnums.BMW,model);
    }
    public Car buildMercedesCar(String model){
       return builCar(CarFactoriesEnums.MERCEDES,model);
    }
    private void initFactories(){
        factories.put(CarFactoriesEnums.AUDI,new AudiCarFactory());
        factories.put(CarFactoriesEnums.BMW,new BMWCarFactor());
        factories.put(CarFactoriesEnums.MERCEDES,new MercedesCarFactor());
    }

    private Car builCar(CarFactoriesEnums type, String model){
        return factories.get(type).buildCar(model);
    }
}
