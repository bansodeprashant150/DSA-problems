public class ArrayDeletion {
    public static void main(String[] args) {
        int[] arr = new int[100]; // Initial array
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
        int size = 5; // Current size of the array

        int positionToDelete = 2; // Index of the element to delete

        // Shift elements to fill the gap left by the deleted element
        for(int i=positionToDelete;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
        
        
        // Update the size of the array

        // Print the updated array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
