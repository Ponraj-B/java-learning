import java.util.*;

class Main 
{
    static Map<Integer, String> stud = new HashMap<>();

    public static void main(String[] args) 
    {
        stud.put(1, "Ponraj");
        stud.put(2, "Siva");
        stud.put(3, "Kumar");
        stud.put(4, "Jesu");
        stud.put(null,"null");
        int target = 5; // Change target to a non-existing key for demonstration
        
        try
        {
            String name = Main.findNameById(target).orElseThrow(() -> new RuntimeException("Value " + target +" is not existing")); // Using OrElseThrow we can throw an Exception or Error if the the returned value from ofNullable is null 
        }
        catch(Exception e)
        {
            System.out.println("Exception raised - " + e.getMessage());
        }
    }

    public static Optional<String> findNameById(int id) 
    {
        if (stud.containsKey(id)) 
        {
            return Optional.ofNullable(stud.get(id));
        }
        return Optional.empty();
    }
}
