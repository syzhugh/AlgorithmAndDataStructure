package algorithm.sort;

import utils.Utils;

public class ShellSort {

	/**
	 * 希尔排序
	 */
	public static void main(String[] args) {
		int[] integerArr = Utils.getIntegerArr(20);
		Utils.showArrStr(integerArr);
		shellSort(integerArr);
		Utils.showArrStr(integerArr);
	}

	public static void shellSort(int[] arr) {
		int d = arr.length / 2;
		while (d > 0) {
			for (int i = 0; i < d; i++) {
				for (int j = i + d; j < arr.length; j += d) {
					if (arr[j] >= arr[j - d]) {
						continue;
					}
					insert(arr, i, j, d);
				}
			}
			d = d / 2;
		}
	}

	public static void insert(int[] arr, int start, int index, int d) {
		int key = arr[index];
		int i;
		for (i = index; i > start && arr[i - d] > key; i -= d) {
			Utils.change(arr, i, i - d);
		}
		arr[i] = key;
	}
}
