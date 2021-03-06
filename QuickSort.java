package Algorithm;

public class QuickSort {

	public static void main(String[] args) {
		final int max = 10;
		int[] A  = new int[]{40, 30, 100, 60, 80, 70, 90, 10, 20, 50};
		int i;
		
		System.out.println("sorting . . .");
		for(i=0; i<max; i++) {
			System.out.println(A[i]);
			
			QuickSort(A, 0, max-1);
		}
	}
	private static void QuickSort(int A[], int start, int end) {
		int index;
		
		if(start < end) {
			index = Partition(A, start, end);
			
			QuickSort(A, start, index-1);
			QuickSort(A, index+1, end);
	}
}
	private static int Partition(int[] A, int start, int end) {
		int pivot = A[end];
		int i;
		int index = start;
		int tmp;
		
		for(i=start; i<end; i++) {
			if(A[i] < A[end]) {
				tmp = A[i];
				A[i] = A[index];
				A[index] = tmp;
				index++;
			}
		}
		
		tmp = A[index];
		A[index] = A[end];
		A[end] = tmp;
		return index;
	}
}
