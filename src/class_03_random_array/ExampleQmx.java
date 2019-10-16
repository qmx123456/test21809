package class_03_random_array;

public class ExampleQmx {
	public static void main(String[] args) {
		int[] arr = NumGenerator.shengChengSuiJiShuZhu(10, 20, 30);
		
		NumCalculator c = new NumCalculator(arr);
		System.out.println(c.buildOutStrFrom());
		System.out.println(c.max());
		System.out.println(c.sum());
		System.out.println(c.average());
	}
}