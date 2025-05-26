import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Add elements
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");
        System.out.println("Stack after adding elements: " + stack);

        // Add all elements from another collection
        List<String> additionalList = Arrays.asList("Programming", "Language");
        stack.addAll(additionalList);
        System.out.println("Stack after addAll: " + stack);

        // Check if the stack contains an element
        System.out.println("Contains 'Java': " + stack.contains("Java"));

        // Check if the stack contains all elements from another collection
        System.out.println("Contains all elements from additionalList: " + stack.containsAll(additionalList));

        // Get the size of the stack
        System.out.println("Size of Stack: " + stack.size());

        // Check if the stack is empty
        System.out.println("Is Stack empty: " + stack.isEmpty());

        // Remove an element
        stack.remove("Hello");
        System.out.println("Stack after removing 'Hello': " + stack);

        // Remove all elements from another collection
        stack.removeAll(additionalList);
        System.out.println("Stack after removeAll: " + stack);

        // Retain only the elements that are contained in another collection
        List<String> retainList = Arrays.asList("World", "Java");
        stack.retainAll(retainList);
        System.out.println("Stack after retainAll: " + stack);

        // Convert the stack to an array
        Object[] array = stack.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Convert the stack to a typed array
        String[] typedArray = stack.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(typedArray));

        // Clear the stack
        stack.clear();
        System.out.println("Stack after clear: " + stack);

        // =========================================================================================================================================
        // Stack-specific methods

        // Push an element onto the stack
        stack.push("First");
        System.out.println("Stack after pushing 'First': " + stack);

        // Peek at the top element of the stack
        stack.push("Second");
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Pop an element from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping: " + stack);

        // Search for an element in the stack
        int position = stack.search("First");
        System.out.println("Position of 'First': " + position);
    }
}
