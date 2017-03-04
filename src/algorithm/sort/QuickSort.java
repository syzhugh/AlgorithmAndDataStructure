package algorithm.sort;

import utils.Utils;

public class QuickSort {

	/**
	 * 快速排序
	 * 
	 */
	public static void main(String[] args) {
		int[] integerArr = Utils.getIntegerArr(20);
		Utils.showArrStr(integerArr);
		quickSort(integerArr, 0, integerArr.length - 1);
		Utils.showArrStr(integerArr);
	}

	public static void quickSort(int[] arr, int l, int r) {
		if (l >= r) {
			return;
		}

		int i = part(arr, l, r);
		quickSort(arr, l, i - 1);
		quickSort(arr, i + 1, r);
	}

	public static int part(int[] arr, int l, int r) {
		int key = arr[l];
		int i = l;
		int j = r;
		while (i < j) {
			while (key < arr[j] && i < j) {
				j--;
			}
			if (i < j) {
				arr[i] = arr[j];
				i++;
			}

			while (key > arr[i] && i < j) {
				i++;
			}
			if (i < j) {
				arr[j] = arr[i];
				j--;
			}
		}
		arr[i] = key;
		return i;
	}
}
