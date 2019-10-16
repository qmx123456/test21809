package class_03_random_array;

public class NumCalculator {
	private int[] arr;
	public NumCalculator(int[] arr){
		this.arr = arr;
	}
	
	public String buildOutStrFrom(){
		StringBuffer res = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			res.append(arr[i]);
			if (i != arr.length - 1) {
				res.append(", ");
			}
		}
		return res.toString();
	}
	
	public int max(){
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}
	public int sum(){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public int average(){
		return sum()/arr.length;
	}
}
