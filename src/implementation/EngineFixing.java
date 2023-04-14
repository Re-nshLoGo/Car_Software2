package implementation;

import enums.CarType;
import interfaces.IService;

import java.util.HashMap;

public class EngineFixing implements IService {
    CarType carType;
    static HashMap<CarType,Integer> priceMap = new HashMap<>();
    static {
        priceMap.put(CarType.HatchBack,5000); //₹ 5000 ₹ 8000 ₹ 10000
        priceMap.put(CarType.Sedan,8000);
        priceMap.put(CarType.Suv,10000);
    }
    public EngineFixing(CarType carType){
        System.out.println("Charges for Engine Fixing – ₹ "+priceMap.get(carType));
        this.carType = carType;
    }

    @Override
    public Integer getPrice() {
        return priceMap.get(carType);
    }
}
