package sorting;

public class SelectionSort {
	public static void main(String[] args) {
		
		int [] myArray = {12, 3, -12, 1, 23, 9, 8, 124, 4, 5};
		
		SelectionSort s = new SelectionSort();
		
		System.out.print("Before Sorting: ");
		s.displayArray(myArray);
		
		s.selectionSort(myArray);
		
		System.out.print("\nAfter Sortig: ");
		s.displayArray(myArray);
	}
	
	public void selectionSort(int[] numbers) {
		int lengthOfArray = numbers.length;
		
		for (int i = 0; i < lengthOfArray-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < lengthOfArray; j++)
				if (numbers[minIndex] > numbers[j])
					minIndex = j;
			if (minIndex != i) {
				int temp = numbers[minIndex];
				numbers[minIndex] = numbers[i];
				numbers[i] = temp;
			}
		}
	}
	
	public void displayArray(int[] array) {
		for (int x : array) {
			System.out.print(x);
			System.out.print("\t");
		}
	}

}
