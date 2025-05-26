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
        
        String name = Main.findNameById(target).orElseGet(() -> Main.studentNotPresent()); // orElseGet will provide some value by calling some method or perform lampda expression
        
        if(name.equals("id_404"))
        {
            System.out.println("Id " + target +" is not available");
        }
        else
        {
            System.out.println("Name found for the id " + name);
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

    public static String studentNotPresent()
    {
        return "id_404";
    }
    
}
