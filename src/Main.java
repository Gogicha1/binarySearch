import java.util.Scanner;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
	
		int [] arr = generateRandomArray(50);
		System.out.println("Generated Array:");
		System.out.println(bubbleSort(arr));
		for (int i = 0; i < arr.length; i++) System.out.print(arr[i]+" ");
		System.out.println("\n");
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter number to find: ");
		int numberToFind = scanner.nextInt();
		System.out.println(binarySearch(arr, numberToFind));
		scanner.close();
	}
	
	 public static int[] generateRandomArray(int length) {
	        int[] arr = new int[length];
	        Random rand = new Random();

	        for (int i = 0; i < length; i++) {
	            arr[i] = rand.nextInt(500) + 1;
	        }

	        return arr;
	    }
	 
	 public static boolean bubbleSort(int[] array) {
		    int n = array.length;
		    for (int i = 0; i < n - 1; i++) {
		        for (int j = 0; j < n - i - 1; j++) {
		            if (array[j] > array[j + 1]) {
		              
		                int temp = array[j];
		                array[j] = array[j + 1];
		                array[j + 1] = temp;
		            }
		        }
		    }
			return false;
		}
	 
	private static int binarySearch(int[] numbers, int numberToFind) {
		int low = 0;
		int high = numbers.length - 1;
		while (low <= high) {
			int middlePosition = (low + high) / 2;
			int middleNumber = numbers[middlePosition];
			
			if (numberToFind == middleNumber) {
				
				return middlePosition;
			}
			
			if (numberToFind < middleNumber) {
				high = middlePosition -1;
				
			}else {
				low = middlePosition + 1;
			}
			
		}
		return -1;  //not found
		
	}
		
}
