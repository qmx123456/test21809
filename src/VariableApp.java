

public class VariableApp {
	public static void main(String[] args) {
		int f0 = 0;
		int f1 = 1;
		int f2 = sum(f0, f1);
		int f3 = sum(f1, f2);
		int f4 = sum(f2, f3);
		
		System.out.println("1¡¢"+f0);
		System.out.println("2¡¢"+f1);
		System.out.println(buildOutStr(3, f0, f1, f2));
		System.out.println(buildOutStr(4,f1,f2,f3));
		System.out.println(buildOutStr(5,f2,f3,f4));
		
	}

	private static String buildOutStr(int i, int f0, int f1, int f2) {
		return i+"¡¢"+f0+"+"+f1+"="+f2;
	}

	private static int sum(int f0, int f1) {
		return f0 +f1;
	}

}
