package algorithm.sort;

import utils.Utils;

public class HalfInsert {

	/**
	 * 二分插入排序
	 */
	public static void main(String[] args) {
		int[] integerArr = Utils.getIntegerArr(20);
		Utils.showArrStr(integerArr);
		halfInsertSort(integerArr);
		Utils.showArrStr(integerArr);
	}

	private static void halfInsertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= arr[i - 1]) {
				continue;
			}
			int temp = arr[i];
			int l = 0;
			int r = i - 1;
			int half = -1;
			while (l < r) {
				half = (l + r) / 2;
				if (arr[half] < temp) {
					l = half + 1;
				} else {
					r = half;
				}
			}
			for (int j = i; j > l; j--) {
				arr[j] = arr[j - 1];
			}
			arr[l] = temp;
			Utils.showArrStr(arr);
		}
	}
}
