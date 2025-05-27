import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<String> queue = new PriorityQueue<>();

        // Add elements
        queue.add("Hello");
        queue.add("World");
        queue.add("Java");
        System.out.println("PriorityQueue after adding elements: " + queue);

        // Add all elements from another collection
        List<String> additionalList = Arrays.asList("Programming", "Language");
        queue.addAll(additionalList);
        System.out.println("PriorityQueue after addAll: " + queue);

        // Check if the queue contains an element
        System.out.println("Contains 'Java': " + queue.contains("Java"));

        // Check if the queue contains all elements from another collection
        System.out.println("Contains all elements from additionalList: " + queue.containsAll(additionalList));

        // Get the size of the queue
        System.out.println("Size of PriorityQueue: " + queue.size());

        // Check if the queue is empty
        System.out.println("Is PriorityQueue empty: " + queue.isEmpty());

        // Remove an element
        queue.remove("Hello");
        System.out.println("PriorityQueue after removing 'Hello': " + queue);

        // Remove all elements from another collection
        queue.removeAll(additionalList);
        System.out.println("PriorityQueue after removeAll: " + queue);

        // Retain only the elements that are contained in another collection
        List<String> retainList = Arrays.asList("World", "Java");
        queue.retainAll(retainList);
        System.out.println("PriorityQueue after retainAll: " + queue);

        // Convert the queue to an array
        Object[] array = queue.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Convert the queue to a typed array
        String[] typedArray = queue.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(typedArray));

        // Clear the queue
        queue.clear();
        System.out.println("PriorityQueue after clear: " + queue);

        // =========================================================================================================================================
        // Queue-specific methods

        // Add an element to the queue
        queue.offer("First");
        System.out.println("PriorityQueue after offering 'First': " + queue);

        // Peek at the head of the queue
        String head = queue.peek();
        System.out.println("Head of PriorityQueue: " + head);

        // Poll the head of the queue
        String polledElement = queue.poll();
        System.out.println("PriorityQueue after polling: " + queue);
        System.out.println("Polled element: " + polledElement);

        // Add more elements to the queue
        queue.offer("Second");
        queue.offer("Third");
        System.out.println("PriorityQueue after offering more elements: " + queue);

        // Iterate over the elements in the queue
        System.out.println("Iterating over PriorityQueue:");
        for (String element : queue) {
            System.out.println(element);
        }
    }
}
