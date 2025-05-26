import java.util.*;

class Main 
{
    
    static Map<Integer,String> stud = new HashMap<>();

    public static void main(String[] args) 
    {
        stud.put(1,"Ponraj");
        stud.put(2,"Siva");
        stud.put(3,"Kumar");
        stud.put(4,"Jesu");
        int target = 1;
        Optional<String> name = Main.findNameById(target);
        if(name.isPresent())
        {
            System.out.println("Name found for the id "+ target + " is "+name.get());
        }
        else
        {
            System.out.println("Name not found");
        }
    }
    
    public static Optional<String> findNameById(int id)
    {
        if(stud.containsKey(id))
        {
            return Optional.ofNullable(stud.get(id)); // ofNUllable will return empty value if the given parameter is null otherwise it will return the value. If we didn't use this method we have manually write optional.empty()
        }
        return Optional.empty();
    }
    
}
