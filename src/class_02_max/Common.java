package class_02_max;

public class Common {
	 public static int max(int num1, int num2) {
	        return num1>num2?num1:num2;
	    }

	    public static float max(float num1, float num2) {
	        return num1>num2?num1:num2;
	    }

	    public static int max(int num1, int num2, int num3) {
	        int max;
	        if (num1>num2) max = num1;
	        else max = num2;

	        int max1;
	        if (max>num3) max1 = max;
	        else max1 = num3;

	        return max1;
	    }

	    public static int max1(int num1, int num2, int num3) {
	        int max = num1>num2?num1:num2;
	        int max1 = max>num3? max:num3;
	        return max1;
	    }

	    public static int max2(int num1, int num2, int num3) {
	        int max = max(num1, num2);
	        int max1 = max(max, num3);
	        return max1;
	    }

	    public static int max3(int num1, int num2, int num3) {
	        return max(max(num1, num2), num3);
	    }

	    public static int maxWithMath(int num1, int num2, int num3) {
	        return Math.max(Math.max(num1, num2), num3);
	    }

	    public static int[] getIntArray(int length) {
	        int[] array = new int[length];
	        for (int i=0;i<length;i++){
	            array[i] = (int)(100 * Math.random());
	        }
	        return array;
	    }
}
