public class QuickSort {
	
	static int partition(int[] arr, int lo, int hi){		
		int pivot =  arr[(lo+hi)/2];
		int i = lo;
		int j = hi;
		while (i < j){
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot){
				j--;
			}
			if (i< j) {
				int aux = arr[i];
				arr[i] = arr[j];
				arr[j] = aux;
				j--;
			}
			i++	;
		}
		return j;
		
	}
	public static void quickSortM(int[] arr, int lo, int hi){
		if (lo <hi) {
			int part = partition( arr,  lo,  hi);
			quickSortM( arr, lo, part);
			quickSortM( arr, part +1 , hi);
		}
	}

	public static void main(String args[]){
		
		int[] v1 ={10,3,2,4,7,3,2,11,1};
		quickSortM(v1,0, v1.length -1);
		
		for (int k = 0; k< v1.length; k++) {
			System.out.print(v1[k] +" ");
		}
		
	}
}
