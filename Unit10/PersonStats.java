import java.util.*;
public class PersonStats
{
    public static void printNames(ArrayList<Person> persons)
    {
        for (Person p : persons)
            System.out.println(p.getName() + " " + p.getPets());
    }
    
    public static int averagePets(ArrayList<Person> persons)
    {
        int sum = 0;
        for (Person p : persons)
        {
            sum += p.getPets();
        }
        return sum/persons.size();
    }
    
    public static Person getMost(ArrayList<Person> persons)
    {
        Person most = persons.get(0);
        for (Person x : persons)
        {
            if (x.getPets() > most.getPets())
                most = x;
        }
        return most;
    }
    
    public static ArrayList<Person> getTwo(ArrayList<Person> persons)
    {
        ArrayList<Person> twos = new ArrayList<>();
        for (Person p : persons)
        {
            if (p.getPets() >= 2)
                twos.add(p);
        }
        
        return twos;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Mike", 4));
        persons.add(new Person("Luna", 3));
        persons.add(new Person("Tessa", 1));
        persons.add(new Person("Chad", 10));
        
       printNames(persons);
        System.out.println("Average pets: " + averagePets(persons));

        Person most = getMost(persons);
        System.out.println("Most pets: " + most.getName() + " " + most.getPets());

        ArrayList<Person> twos = getTwo(persons);
        System.out.print("People with two or more pets: ");
        for (Person p : twos) {
            System.out.print(p.getName() + " ");
        
    }
    }
    
}