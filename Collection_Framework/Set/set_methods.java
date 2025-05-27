import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Hello");
        set.add("World");
        set.add("Java");
        System.out.println("HashSet after adding elements: " + set);

        // Add all elements from another collection
        List<String> additionalList = Arrays.asList("Programming", "Language");
        set.addAll(additionalList);
        System.out.println("HashSet after addAll: " + set);

        // Check if the set contains an element
        System.out.println("Contains 'Java': " + set.contains("Java"));

        // Check if the set contains all elements from another collection
        System.out.println("Contains all elements from additionalList: " + set.containsAll(additionalList));

        // Get the size of the set
        System.out.println("Size of HashSet: " + set.size());

        // Check if the set is empty
        System.out.println("Is HashSet empty: " + set.isEmpty());

        // Remove an element
        set.remove("Hello");
        System.out.println("HashSet after removing 'Hello': " + set);

        // Remove all elements from another collection
        set.removeAll(additionalList);
        System.out.println("HashSet after removeAll: " + set);

        // Retain only the elements that are contained in another collection
        List<String> retainList = Arrays.asList("World", "Java");
        set.retainAll(retainList);
        System.out.println("HashSet after retainAll: " + set);

        // Convert the set to an array
        Object[] array = set.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Convert the set to a typed array
        String[] typedArray = set.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(typedArray));

        // Clear the set
        set.clear();
        System.out.println("HashSet after clear: " + set);

        // =========================================================================================================================================
        // Set-specific methods

        // Check if two sets are equal
        HashSet<String> anotherSet = new HashSet<>(Arrays.asList("World", "Java"));
        System.out.println("Is HashSet equal to anotherSet: " + set.equals(anotherSet));

        // Get the hash code of the set
        System.out.println("Hash code of HashSet: " + set.hashCode());

        // Create a union of two sets
        set.addAll(anotherSet);
        System.out.println("Union of HashSet and anotherSet: " + set);

        // Create an intersection of two sets
        set.retainAll(anotherSet);
        System.out.println("Intersection of HashSet and anotherSet: " + set);

        // Create a difference of two sets
        set.removeAll(anotherSet);
        System.out.println("Difference of HashSet and anotherSet: " + set);
    }
}
