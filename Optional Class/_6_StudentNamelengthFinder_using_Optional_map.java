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
        int target = 1; // Change target to a non-existing key for demonstration
        
        Optional<String> name = Main.findNameById(target);
        
        int len = name.map(String :: length).orElse(0); // Optional.map will transfer the value to something else based on the logic
        
        if(len>0)
        {
            System.out.println("length of the name " + name.get() + " is " + len);
        }
        else
        {
            System.out.println("id " + target + " not found");
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
