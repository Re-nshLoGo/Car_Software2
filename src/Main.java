import implementation.ServiceStation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceStation.showServicesTypes();
        String carType = sc.next();
        List<String> services = new ArrayList<>();
        System.out.println("Enter total number of services you want: ");
        int n = sc.nextInt();
        System.out.println("Enter Service codes one by one -");
        while(n --> 0){
            services.add(sc.next());
        }




        ServiceStation serviceStation = new ServiceStation(carType,services);
        int totalPrice = serviceStation.getTotalprice();
        System.out.println("Total price - "+totalPrice);
        if(totalPrice > 10000){
            System.out.println("!!! you have got the complimentary cleaning services.");
        }
    }
}