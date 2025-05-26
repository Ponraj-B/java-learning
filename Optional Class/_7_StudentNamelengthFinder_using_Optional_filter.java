import java.util.*;

class Main 
{
    static Map<Integer, String> stud = new HashMap<>();
    
    public static void main(String[] args) 
    {
        stud.put(1, "Ponraja");
        stud.put(2, "Siva");
        stud.put(3, "Kumar");
        stud.put(4, "Jesu");
        stud.put(null,"null");
        int target = 1; // Change target to a non-existing key for demonstration
        
        Optional<String> name = Main.findNameById(target);
        
        String res = name.filter(s -> s.length() > 6).orElse("Name is less than 6 character"); // Optional.filter will filter the result if the value didn't pass the filter condition orElse will give Default value
        
        Optional.of(res).ifPresent(System.out :: println);

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
