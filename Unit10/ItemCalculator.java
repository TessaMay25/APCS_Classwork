import java.util.*;




public class ItemCalculator
{
    public static void printItems(ArrayList<Item> items)
    {
        for (Item i : items)
            System.out.println(i.getName() + " " + i.getPrice());
    }
    
    public static float averagePrice(ArrayList<Item> items)
    {
        float sum = 0;
        for (Item i : items)
        {
            sum += i.getPrice();
        }
        return sum/items.size();
    }
    
    public static Item getExpensive(ArrayList<Item> items)
    {
        
        
        
        Item expensive = items.get(0);
        
        for (Item e : items)
        {
            if (e.getPrice() > expensive.getPrice())
                expensive = e;
            
        }
        return expensive;
       
    }
        
    
    
    
    public static void main(String[] args)
    {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Milk", 5));
        items.add(new Item("Steak", 20));
        items.add(new Item("Banana", 1));
        items.add(new Item("Chips", 3));
        
        printItems(items);
        System.out.println("average price: " + averagePrice(items));
        
        Item expensive = getExpensive(items);
        System.out.println("Most expensive: " + expensive.getName() + " " + expensive.getPrice());

        
        
    }
}