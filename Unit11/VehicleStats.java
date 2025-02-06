import java.util.*;
public class VehicleStats
{
    public int getWheels(ArrayList<Vehicle> vehicles)
    {
        int sum = 0;
        for (Vehicle v : vehicles)
        {
            sum += v.wheelCount();
        }
        return sum;
    }
    
    public ArrayList<Vehicle> getPower(ArrayList<Vehicle> vehicles)
    {
        ArrayList<Vehicle> human = new ArrayList<>();
        for (Vehicle v : vehicles)
        {
            if (v.isHumanPowered() == true)
                human.add(v);
        }
        return human;
    }
    
    
}