import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Create an ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements
        deque.add("Hello");
        deque.add("World");
        deque.add("Java");
        System.out.println("ArrayDeque after adding elements: " + deque);

        // Add all elements from another collection
        List<String> additionalList = Arrays.asList("Programming", "Language");
        deque.addAll(additionalList);
        System.out.println("ArrayDeque after addAll: " + deque);

        // Check if the deque contains an element
        System.out.println("Contains 'Java': " + deque.contains("Java"));

        // Check if the deque contains all elements from another collection
        System.out.println("Contains all elements from additionalList: " + deque.containsAll(additionalList));

        // Get the size of the deque
        System.out.println("Size of ArrayDeque: " + deque.size());

        // Check if the deque is empty
        System.out.println("Is ArrayDeque empty: " + deque.isEmpty());

        // Remove an element
        deque.remove("Hello");
        System.out.println("ArrayDeque after removing 'Hello': " + deque);

        // Remove all elements from another collection
        deque.removeAll(additionalList);
        System.out.println("ArrayDeque after removeAll: " + deque);

        // Retain only the elements that are contained in another collection
        List<String> retainList = Arrays.asList("World", "Java");
        deque.retainAll(retainList);
        System.out.println("ArrayDeque after retainAll: " + deque);

        // Convert the deque to an array
        Object[] array = deque.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Convert the deque to a typed array
        String[] typedArray = deque.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(typedArray));

        // Clear the deque
        deque.clear();
        System.out.println("ArrayDeque after clear: " + deque);

        // =========================================================================================================================================
        // Deque-specific methods

        // Add elements at the beginning and end
        deque.addFirst("First");
        deque.addLast("Last");
        System.out.println("ArrayDeque after adding 'First' and 'Last': " + deque);

        // Get elements from the beginning and end
        String firstElement = deque.getFirst();
        String lastElement = deque.getLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Remove elements from the beginning and end
        deque.removeFirst();
        deque.removeLast();
        System.out.println("ArrayDeque after removing first and last elements: " + deque);

        // Peek at the beginning and end
        String peekFirst = deque.peekFirst();
        String peekLast = deque.peekLast();
        System.out.println("Peek first element: " + peekFirst);
        System.out.println("Peek last element: " + peekLast);

        // Poll elements from the beginning and end
        String pollFirst = deque.pollFirst();
        String pollLast = deque.pollLast();
        System.out.println("ArrayDeque after polling first and last elements: " + deque);
