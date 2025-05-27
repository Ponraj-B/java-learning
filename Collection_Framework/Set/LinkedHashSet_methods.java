import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements
        set.add("Hello");
        set.add("World");
        set.add("Java");
        System.out.println("LinkedHashSet after adding elements: " + set);

        // Add all elements from another collection
        List<String> additionalList = Arrays.asList("Programming", "Language");
        set.addAll(additionalList);
        System.out.println("LinkedHashSet after addAll: " + set);

        // Check if the set contains an element
        System.out.println("Contains 'Java': " + set.contains("Java"));

        // Check if the set contains all elements from another collection
        System.out.println("Contains all elements from additionalList: " + set.containsAll(additionalList));

        // Get the size of the set
        System.out.println("Size of LinkedHashSet: " + set.size());

        // Check if the set is empty
        System.out.println("Is LinkedHashSet empty: " + set.isEmpty());

        // Remove an element
        set.remove("Hello");
        System.out.println("LinkedHashSet after removing 'Hello': " + set);

        // Remove all elements from another collection
        set.removeAll(additionalList);
        System.out.println("LinkedHashSet after removeAll: " + set);

        // Retain only the elements that are contained in another collection
        List<String> retainList = Arrays.asList("World", "Java");
        set.retainAll(retainList);
        System.out.println("LinkedHashSet after retainAll: " + set);

        // Convert the set to an array
        Object[] array = set.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Convert the set to a typed array
        String[] typedArray = set.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(typedArray));

        // Clear the set
        set.clear();
        System.out.println("LinkedHashSet after clear: " + set);

        // =========================================================================================================================================
        // Set-specific methods

        // Check if two sets are equal
        LinkedHashSet<String> anotherSet = new LinkedHashSet<>(Arrays.asList("World", "Java"));
        System.out.println("Is LinkedHashSet equal to anotherSet: " + set.equals(anotherSet));

        // Get the hash code of the set
        System.out.println("Hash code of LinkedHashSet: " + set.hashCode());

        // Create a union of two sets
        set.addAll(anotherSet);
        System.out.println("Union of LinkedHashSet and anotherSet: " + set);

        // Create an intersection of two sets
        set.retainAll(anotherSet);
        System.out.println("Intersection of LinkedHashSet and anotherSet: " + set);

        // Create a difference of two sets
        set.removeAll(anotherSet);
        System.out.println("Difference of LinkedHashSet and anotherSet: " + set);
    }
}
