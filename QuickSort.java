package sorting;

public class QuickSort {

	public static void main (String[] args) {
		QuickSort demo = new QuickSort();
		
		int[] inputArray = {12, 3, -12, 14, 23, 9, 8, 14, 4, 5, -8, 0, 17, 13, 1};
		
		demo.quickSort(inputArray, 0, inputArray.length-1);
		
		System.out.print("Post Sorting.... Array:=>");
		for (int i : inputArray)
			System.out.print(i+"\t");
	}
	
	public void quickSort(int[] array, int left, int right) {
		int index = partition(array, left, right);
		if (left < index-1) {
			quickSort(array, left, index-1);
		}
		if (right > index) {
			quickSort(array, index, right);
		}
	}
	
	public int partition(int[] numbers, int left, int right) {
		int pivot = numbers[(left+right)/2];
		
		while(left <= right) {
			while (numbers[left] < pivot)
				left++;
			while (numbers[right] > pivot)
				right--;
			if (left <= right){
				int temp = numbers[left];
				numbers[left] = numbers[right];
				numbers[right] = temp;
				left++;
				right--;
			}
		}
		return left;
	}
}
