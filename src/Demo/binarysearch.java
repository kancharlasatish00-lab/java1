package Demo;

import java.util.Arrays;

public class binarysearch {
//	static int binarySearch(int[] arr,int target) {
//		
//		int left = 0;
//		int right = arr.length - 1;
//		while(left <= right) {
//			int mid = left + (right - left) / 2;
//			if (arr[mid] == target) {
//				return mid;
//			}
//			if (arr[mid] < target) {
//				left = mid + 1;
//			}
//			else {
//				right = mid - 1;
//			}
//		}
//		return -1;
//	}
//	public static void main(String[] args) {
//		int[] arr = {10, 20, 30, 40, 50, 60, 70};
//		int target = 50;
//		int result = binarySearch(arr, target);
//		System.out.println("found at index: " + result);
//	

	
	
static int binarySearch(int[] arr,int key) {
		
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			else if (arr[mid] < key) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {40, 20, 10, 60, 50, 70, 30};
		int key = 10;
		Arrays.sort(arr);
		System.out.println("sorted array: " + Arrays.toString(arr));
		int result = binarySearch(arr, key);
		if (result != -1) {
			System.out.println("Element" + key + "found at index: " + result);
		} else {
			System.out.println("Element" + key + " not found");
		}
	}
}
