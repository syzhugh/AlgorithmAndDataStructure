package algorithm.sort;

import utils.Utils;

public class PopSort {

	/**
	 * 冒泡排序
	 */

	public static void main(String[] args) {
		int[] integerArr = Utils.getIntegerArr(20);
		Utils.showArrStr(integerArr);
		popSort(integerArr);
		Utils.showArrStr(integerArr);
	}

	public static void popSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					Utils.change(arr, j, j + 1);
				}
			}
		}
	}
}
