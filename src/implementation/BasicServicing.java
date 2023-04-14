package implementation;


import enums.CarType;
import interfaces.IService;
import java.util.*;

public class BasicServicing implements IService {
    CarType carType;
    static HashMap<CarType,Integer> priceMap = new HashMap<>();
    static {
        priceMap.put(CarType.HatchBack,2000); //₹ 2000 ₹ 4000 ₹ 5000
        priceMap.put(CarType.Sedan,4000);
        priceMap.put(CarType.Suv,5000);
    }

    BasicServicing(CarType carType){
        System.out.println("Charges for Basic Servicing – ₹ "+priceMap.get(carType));
        this.carType = carType;
    }

    @Override
    public Integer getPrice() {
        return priceMap.get(carType);
    }
}
