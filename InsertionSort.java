package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort obj = new InsertionSort();
		int[] inputArray = {3, 1, 12, -9, -5, 15, 11, 19, 7, 4};
		
		obj.insertionSort(inputArray);
		
		System.out.print("After Insertion Sort: ");
		for (int i : inputArray)
			System.out.print(i+"\t");
	}
	
	public void insertionSort(int[] numbers) {
		for (int i = 0; i < numbers.length-1; i++)
			for (int j = i+1; j > 0; j--)
				if (numbers[j] < numbers[j-1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = temp;
				}
	}
}
