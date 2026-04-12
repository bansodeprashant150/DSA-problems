public class ArrayInsertion {
    public static void main(String[] args) {
        int[] arr = new int[100]; // Initial array
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
        int size = 5; // Current size of the array

        int newPosition = 2; // Index where you want to insert the new element
        int newElement = 7; // Element to be inserted

        // Shift elements to make space for the new element
        for (int i = size - 1; i >= newPosition; i--) {
            arr[i + 1] = arr[i];
        }

        // Insert the new element at the specified position
        arr[newPosition] = newElement;

        size++; // Update the size of the array

        // Print the updated array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
