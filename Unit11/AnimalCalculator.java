import java.util.*;
public class AnimalCalculator
{
    public void getInfo(ArrayList<Animal> animals)
    {
        for (Animal animal : animals)
        {
            System.out.println("Name: " + animal.getName() + " " + "Legs: " + animal.getLegCount() + " " + "Furry?: " + animal.isFurry());
        }
    
    }
    public double averageLegs(ArrayList<Animal> animals)
    {
        double sum = 0;
        for (Animal animal : animals)
        {
            sum += animal.getLegCount();
        }
        return sum/animals.size();
    }
    public Animal fewestLegs(ArrayList<Animal> animals)
    {
        Animal fewest = animals.get(0);
        for (Animal animal : animals)
        {
            if (animal.getLegCount() < fewest.getLegCount())
            {
                fewest = animal;
            }
        }
        return fewest;
    }
}