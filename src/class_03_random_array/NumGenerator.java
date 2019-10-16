package class_03_random_array;

public class NumGenerator {
	public static int[] shengChengSuiJiShuZhu(int length, int min, int max) {
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (max-min))+min;
		}

		return arr;
	}
}
