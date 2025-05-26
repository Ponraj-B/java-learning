


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
        int target = 5; // Change target to a non-existing key for demonstration
        String name = Main.findNameById(target).orElse("not_found"); // orElse method will check the returned value by the Optional.ofNullable() and if the value is null it will provide the static value from the orElse method
        if(name.equals("not_found"))
        {
            System.out.println("Name not found for the id " + target);
        }
        else
        {
            System.out.println("Name found for the id " + target + " is "+name);
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
