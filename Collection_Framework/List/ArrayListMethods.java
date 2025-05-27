import java.util.*;

public class ArrayListDemo 
{
    public static void main(String[] args) 
    {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println("ArrayList after adding elements: " + list);

        // Add all elements from another collection
        List<String> additionalList = Arrays.asList("Programming", "Language");
        list.addAll(additionalList);
        System.out.println("ArrayList after addAll: " + list);

        // Check if the list contains an element
        System.out.println("Contains 'Java': " + list.contains("Java"));

        // Check if the list contains all elements from another collection
        System.out.println("Contains all elements from additionalList: " + list.containsAll(additionalList));

        // Get the size of the list
        System.out.println("Size of ArrayList: " + list.size());

        // Check if the list is empty
        System.out.println("Is ArrayList empty: " + list.isEmpty());

        // Remove an element
        list.remove("Hello");
        System.out.println("ArrayList after removing 'Hello': " + list);

        // Remove all elements from another collection
        list.removeAll(additionalList);
        System.out.println("ArrayList after removeAll: " + list);

        // Retain only the elements that are contained in another collection
        List<String> retainList = Arrays.asList("World", "Java");
        list.retainAll(retainList);
        System.out.println("ArrayList after retainAll: " + list);

        // Convert the list to an array
        Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Convert the list to a typed array
        String[] typedArray = list.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(typedArray));

        // Clear the list
        list.clear();
        System.out.println("ArrayList after clear: " + list);

// =========================================================================================================================================
// List-specific methods

// Add an element at a specific index
        list.add(0, "First");
        System.out.println("ArrayList after adding 'First' at index 0: " + list);

// Get an element at a specific index
        list.add("Second");
        String element = list.get(0);
        System.out.println("Element at index 0: " + element);

// Set an element at a specific index
        list.set(0, "Updated First");
        System.out.println("ArrayList after setting 'Updated First' at index 0: " + list);

// Remove an element at a specific index
        list.remove(0);
        System.out.println("ArrayList after removing element at index 0: " + list);

// Get the index of an element
        int index = list.indexOf("Second");
        System.out.println("Index of 'Second': " + index);

// Get the last index of an element
        list.add("Second");
        int lastIndex = list.lastIndexOf("Second");
        System.out.println("Last index of 'Second': " + lastIndex);

// Sublist from the list
        list.add("Third");
        List<String> sublist = list.subList(1, 3);
        System.out.println("Sublist from index 1 to 3: " + sublist);
    }
}
