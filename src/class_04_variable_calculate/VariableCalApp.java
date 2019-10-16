package class_04_variable_calculate;

public class VariableCalApp {

	public static void main(String[] args) {
        int num1=3;
        int num2=2;
        int sum= VariableCal.sum(num1, num2);
        System.out.println(VariableCal.buildOutStr(1, "+", num1, num2, sum));

        int num3=7;
        int num4=2;
        int diff= VariableCal.diff(num3, num4);
        System.out.println(VariableCal.buildOutStr(2, "-", num3, num4, diff));

        int num5=10;
        int num6=5;
        int div= VariableCal.div(num5, num6);
        System.out.println(VariableCal.buildOutStr(3, "/", num5, num6, div));

        int num7=4;
        int num8=2;
        int mul= VariableCal.mul(num7, num8);
        System.out.println(VariableCal.buildOutStr(4, "*", num7, num8, mul));	
	}

}
