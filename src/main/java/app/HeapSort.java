package app;

public class HeapSort {
public void sort(int arr[])
 {
     int N = arr.length;			// size of the array 

     // Build heap structure (rearrange array)
     for (int i = N / 2 - 1; i >= 0; i--)
         heapify(arr, N, i);

     // Step by step extract each element from heap
     for (int i = N - 1; i > 0; i--) {
         // Move current root to end
         int tmp = arr[0];
         arr[0] = arr[i];
         arr[i] = tmp;

         // call max heapify on the reduced heap
         heapify(arr, i, 0);
     }
 }

 // To heapify a subtree rooted with node i which is
 // an index in arr[]. n is size of heap
 void heapify(int arr[], int N, int i)
 {
     int largest = i; // Initialize largest as root
     int l = 2 * i + 1; // index of the left child
     int r = 2 * i + 2; // index of the right child

     // If left child is larger than root
     if (l < N && arr[l] > arr[largest])
         largest = l;

     // If right child is larger than largest
     if (r < N && arr[r] > arr[largest])
         largest = r;

     // check If root is not largest
     if (largest != i) {
         int swap = arr[i];
         arr[i] = arr[largest];
         arr[largest] = swap;

         // Recursively call heapify to the affected sub-tree
         heapify(arr, N, largest);
     }
 }

 /* A function to print array of size n */
 static void printArray(int arr[])
 {
     int N = arr.length;

     for (int i = 0; i < N; ++i)
         System.out.print(arr[i] + " ");
     System.out.println();
 }

 // Main method code
		 public static void main(String args[])
		 {
		     int arr[] = { 7,6,9,1,2,5,3,4,87,11};
		     int N = arr.length;  					// size of the array 
		
		     // Create a object of heapsort 
		     HeapSort obj = new HeapSort();
		     obj.sort(arr);
		
		     System.out.println("Sorted array is");
		     printArray(arr);
		 }
}
