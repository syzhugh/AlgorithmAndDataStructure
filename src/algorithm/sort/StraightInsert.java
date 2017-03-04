package algorithm.sort;

import utils.Utils;

public class StraightInsert {

	/**
	 * 直接插入排序
	 */
	public static void main(String[] args) {
		int[] integerArr = Utils.getIntegerArr(20);
		Utils.showArrStr(integerArr);
		insertSort(integerArr);
		Utils.showArrStr(integerArr);
	}

	private static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= arr[i - 1]) {
				continue;
			}
			int j;
			int temp;
			for (j = i, temp = arr[i]; j > 0 && arr[j - 1] > temp; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = temp;
		}
	}
}
