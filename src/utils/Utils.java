package utils;

public class Utils {

	public static int[] getIntegerArr(int length) {
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			// System.out.println(arr[i]);
		}
		return arr;
	}

	public static int[] getIntegerArr(int length, int floor, int ceil) {
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * Math.abs(ceil - floor + 1) + floor);
			// System.out.println(arr[i]);
		}
		return arr;
	}

	public static void change(int[] arr, int i, int j) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[j] ^ arr[i];
		arr[i] = arr[i] ^ arr[j];
	}

	public static void showArrStr(int[] temp) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < temp.length; i++) {
			if (i % 20 == 0 && i > 0) {
				builder.append("\n");
			}
			builder.append(temp[i] + " ");
		}
		System.out.println(builder.toString());
	}
}
