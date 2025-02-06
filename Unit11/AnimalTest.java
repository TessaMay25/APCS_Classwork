import java.util.*;
public class AnimalTest
{
    public static void main(String[] args)
    {
        Animal[] animals = {new Human(), new Cat(), new Dog(), new Fish()};
        for (Animal animal : animals)
        {
            System.out.println("Name: " + animal.getName());
            System.out.println("Leg Count: " + animal.getLegCount());
            System.out.println("Furry: " + animal.isFurry());
            
        }
        
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog());
        animalList.add(new Cat());
        animalList.add(new Fish());
        
        /*
        for (Animal a : animalList)
        {
            System.out.println(a.getInfo());
        }*/
        
        AnimalCalculator calc = new AnimalCalculator();
        calc.getInfo(animalList);
        
        
        double average = calc.averageLegs(animalList);
        System.out.println("Average legs: " + average);
        
        Animal fewestLegsAnimal = calc.fewestLegs(animalList);
        System.out.println("Fewest legs: " + fewestLegsAnimal.getName());
    }
}