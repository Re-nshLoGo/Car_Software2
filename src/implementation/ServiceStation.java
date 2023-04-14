package implementation;

import enums.CarType;
import interfaces.IServiceprovider;

import java.util.ArrayList;
import java.util.List;

public class ServiceStation implements IServiceprovider {
    CarType carType;
    List<String> services = new ArrayList<>();
    public ServiceStation(String cartype, List<String> services){
        this.carType = getCarType(cartype);
        this.services= services;
    }
    public CarType getCarType(String cartype){
        if(cartype.equals("Suv")){
           return CarType.Suv;
        }else  if(cartype.equals("Sedan")){
            return CarType.Sedan;
        }else
            return CarType.HatchBack;
    }
    Integer totalPrice = 0;
    @Override
    public Integer getTotalprice() {
        for (String servicing : services) {
            if(servicing.equals("BS01")){
                BasicServicing bs = new BasicServicing(this.carType);
                totalPrice += bs.getPrice();
            }else if(servicing.equals("EF01")){
                EngineFixing bs = new EngineFixing(this.carType);
                totalPrice += bs.getPrice();
            }else if(servicing.equals("GF01")){
                GearFixing bs = new GearFixing(this.carType);
                totalPrice += bs.getPrice();
            }else if(servicing.equals("BF01")){
                BrakeFixing bs = new BrakeFixing(this.carType);
                totalPrice += bs.getPrice();
            }else if(servicing.equals("CF01")){
                ClutchFixing bs = new ClutchFixing(this.carType);
                totalPrice += bs.getPrice();
            }
        }
        return totalPrice;

    }

    public static void showServicesTypes() {
        System.out.println("!! Welcome to Car Servicing Station");
        System.out.println("There are providing many services eg BS01(Basic Servicing), EF01(Engine Fixing), CF01(Clutch Fixing)," +
                " GF01(Gear Fixing) and BF01(Break Fixing)");
        System.out.println("Enter type of car eg Hatchback, Sedan, Suv\n");
    }


}
