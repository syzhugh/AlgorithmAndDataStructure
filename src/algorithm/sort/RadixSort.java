package algorithm.sort;

import java.util.LinkedList;
import java.util.Queue;

import utils.Utils;

public class RadixSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] integerArr = Utils.getIntegerArr(10, 0, 1000);
		Utils.showArrStr(integerArr);
		radixSort(integerArr, 4);
		System.out.println("-------end");
		Utils.showArrStr(integerArr);
	}

	private static void radixSort(int[] arr, int _long) {
		System.out.println("-------start");
		Queue[] queue = new Queue[10];
		for (int i = 0; i < queue.length; i++) {
			queue[i] = new LinkedList();
		}

		for (int i = 0; i < _long; i++) {
			for (int j = 0; j < arr.length; j++) {
				int digit = getDigit(arr[j], i);
				queue[digit].add(Integer.valueOf(arr[j]));
			}

			for (int k = 0, index = 0; k < queue.length && index < arr.length; k++) {
				while (!queue[k].isEmpty()) {
					arr[index++] = ((Integer) queue[k].remove()).intValue();
				}
			}
			Utils.showArrStr(arr);
		}
	}

	public static int getDigit(int data, int n) {
		int temp = 1;
		for (int i = 0; i < n; i++) {
			temp *= 10;
		}
		return data / temp % 10;
	}
}
