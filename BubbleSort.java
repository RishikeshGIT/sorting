package sorting;

public class BubbleSort {

	public void bubbleSort(int [] numbers) {
		int lengthOfArray = numbers.length;
		for (int pass = 0; pass < lengthOfArray-1; pass++) { //controls the number of loops: Pass
			for (int i = 0; i < lengthOfArray-pass-1; i++)//controls elements for each of the Passes
				if (numbers[i] > numbers[i+1])
					swap(i, i+1, numbers);
		}
	}
	
	public void swap (int x, int y, int [] array) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
	
	public static void main(String[] args) {
		BubbleSort s = new BubbleSort();
		int [] input = {12, 3, -12, 1, 23, 9, 8, 14, 4, 5, -8, 0, 17, 13};
		
		System.out.println("Before sorting:");
		s.displayArray(input);
		
		s.bubbleSort(input);
		
		System.out.println("After sorting:");
		s.displayArray(input);	
	}
	
	public void displayArray(int[] array) {
		for (int i : array) {
			System.out.println(i+"\t");
		}
	}
}
