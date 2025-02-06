import java.util.*;

public class VehicleTest
{
    public static void main(String[] args)
    {
        System.out.println("VehicleTest");
        
        VehicleStats stats = new VehicleStats();
        
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());
        vehicles.add(new Bicycle());
        vehicles.add(new Unicycle());
        
        for (Vehicle v : vehicles)
        {
            System.out.println(v.getName() + " " + v.wheelCount() + " " + v.isHumanPowered());
        }
        
        ArrayList<Vehicle> result = stats.getPower(vehicles);
        
        int results = stats.getWheels(vehicles);
        System.out.println("Wheel Count: " + results);
        System.out.println("Human Power: " + result);
        
    }
}