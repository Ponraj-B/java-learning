import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> set = new TreeSet<>();

        // Add elements
        set.add("Hello");
        set.add("World");
        set.add("Java");
        System.out.println("TreeSet after adding elements: " + set);

        // Add all elements from another collection
        List<String> additionalList = Arrays.asList("Programming", "Language");
        set.addAll(additionalList);
        System.out.println("TreeSet after addAll: " + set);

        // Check if the set contains an element
        System.out.println("Contains 'Java': " + set.contains("Java"));

        // Check if the set contains all elements from another collection
        System.out.println("Contains all elements from additionalList: " + set.containsAll(additionalList));

        // Get the size of the set
        System.out.println("Size of TreeSet: " + set.size());

        // Check if the set is empty
        System.out.println("Is TreeSet empty: " + set.isEmpty());

        // Remove an element
        set.remove("Hello");
        System.out.println("TreeSet after removing 'Hello': " + set);

        // Remove all elements from another collection
        set.removeAll(additionalList);
        System.out.println("TreeSet after removeAll: " + set);

        // Retain only the elements that are contained in another collection
        List<String> retainList = Arrays.asList("World", "Java");
        set.retainAll(retainList);
        System.out.println("TreeSet after retainAll: " + set);

        // Convert the set to an array
        Object[] array = set.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Convert the set to a typed array
        String[] typedArray = set.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(typedArray));

        // Clear the set
        set.clear();
        System.out.println("TreeSet after clear: " + set);

        // =========================================================================================================================================
        // Set-specific methods

        // Check if two sets are equal
        TreeSet<String> anotherSet = new TreeSet<>(Arrays.asList("World", "Java"));
        System.out.println("Is TreeSet equal to anotherSet: " + set.equals(anotherSet));

        // Get the hash code of the set
        System.out.println("Hash code of TreeSet: " + set.hashCode());

        // Create a union of two sets
        set.addAll(anotherSet);
        System.out.println("Union of TreeSet and anotherSet: " + set);

        // Create an intersection of two sets
        set.retainAll(anotherSet);
        System.out.println("Intersection of TreeSet and anotherSet: " + set);

        // Create a difference of two sets
        set.removeAll(anotherSet);
        System.out.println("Difference of TreeSet and anotherSet: " + set);

        // Get the first element
        System.out.println("First element: " + set.first());

        // Get the last element
        System.out.println("Last element: " + set.last());

        // Get a subset
        SortedSet<String> subset = set.subSet("Java", "World");
        System.out.println("Subset from 'Java' to 'World': " + subset);

        // Get a head set
        SortedSet<String> headSet = set.headSet("Java");
        System.out.println("HeadSet up to 'Java': " + headSet);

        // Get a tail set
        SortedSet<String> tailSet = set.tailSet("Java");
        System.out.println("TailSet from 'Java': " + tailSet);
    }
}
