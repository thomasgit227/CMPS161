package chapter7;

public class ArraySortingMethods {
	
	//Change these (Touchy Allowed)
	private final static int INDICES = 100;
	
	//Variables for Class Use (No Touchy)
	private static int[] arr = new int[INDICES];
	private static int sortType = 0; 

	public static void main(String[] args) {
		printArray(arr);
		generateArray(arr, 10, 500);
		printArray(arr);
		selectionSort(arr);
		printArray(arr);
	}
	
	//Prints all Elements
	public static void printArray(int[] printedArray) {
		System.out.print("Array Contains: ");
		
		if(printedArray.length != 0) {
			System.out.print(printedArray[0]);
			for(int i = 1; i < printedArray.length; i ++) {
				if(printedArray.length == 2) {
					break;
				}
				System.out.print(", " + arr[i]);
			}
		}
		System.out.print("\n");
	}
	
	//Randomizes Initial Array
	public static void generateArray(int[] genArray, int min, int max) {
		for(int i = 0; i < genArray.length; i++) {
			genArray[i] = (int)(min + (Math.random() * (max-min)));
		}
	}

	//Selection Sort
	public static void selectionSort(int[] sortArray) {
		if(sortArray.length != 0) {
			for(int i = 0; i < sortArray.length; i++) {
				for(int j = i; j < sortArray.length; j++) {
					if(sortArray[j] < sortArray[i]) {
						//Swap
						int temp = sortArray[i];
						sortArray[i] = sortArray[j];
						sortArray[j] = temp;
					}
				}
			}
		}
	}
	
	
}
