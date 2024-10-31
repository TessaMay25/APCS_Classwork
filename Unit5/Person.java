public class Person
{
    public Person(String nameIs)
    {
        name = nameIs;
    }
    public void greeting()
    {
        System.out.println("Hello, my name is " + name);
        System.out.println("and I have " + numberOfPets + "pets.");
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public String getName()
    {
        return name;
    }
    private String name;
    private static final int numberOfPets = 1;
}



    