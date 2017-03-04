package algorithm.sort;

import utils.Utils;

public class MergeSort {
	public static void main(String[] args) {
		int[] integerArr = Utils.getIntegerArr(20);
		Utils.showArrStr(integerArr);
		sort(integerArr, 0, integerArr.length - 1);
		Utils.showArrStr(integerArr);
	}

	private static void sort(int[] arr, int l, int r) {
		int mid = (l + r) / 2;
		if (l < r) {
			sort(arr, l, mid);
			sort(arr, mid + 1, r);
			merge(arr, l, mid, r);
		}
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int[] tempArr = new int[r - l + 1];

		int index_L = l;
		int index_R = mid + 1;
		int index_temp = 0;

		// 左右对比插入新数组
		while (index_L <= mid && index_R <= r && index_temp < tempArr.length) {
			if (arr[index_L] < arr[index_R]) {
				tempArr[index_temp++] = arr[index_L++];
			} else {
				tempArr[index_temp++] = arr[index_R++];
			}
		}

		// 把左边边剩余的数移入数组
		while (index_L <= mid) {
			tempArr[index_temp++] = arr[index_L++];
		}

		// 把右边边剩余的数移入数组
		while (index_R <= r) {
			tempArr[index_temp++] = arr[index_R++];
		}

		for (int i = 0; i < tempArr.length; i++) {
			arr[i + l] = tempArr[i];
		}
	}
}
