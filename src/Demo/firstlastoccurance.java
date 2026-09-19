package Demo;

public class firstlastoccurance {

	static int firstOccurance(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int answer = -1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			
			if (arr[mid] == target) {
				answer = mid;
				right = mid - 1; // go left for first occurrence
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return answer;
	}

	static int lastOccurance(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int answer = -1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			
			if (arr[mid] == target) {
				answer = mid;
				left = mid + 1; // go right for last occurrence
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,20,20,20,30,40};
		int target = 20;
		
		System.out.println("First:" + firstOccurance(arr, target));
	    System.out.println("Last:" + lastOccurance(arr, target));
	}
}