package class_05_say_number;
import java.util.*;
public class SayNumApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = getInput(sc);
		int remainder = input%3;
		int res;
		if(remainder == 0){
			res = 3;
		}else{
			res = remainder;
		}
		
		System.out.println("������������"+input+"��Ӧ�ñ���"+res);
	}

	private static int getInput(Scanner sc) {
		System.out.print("��������ţ�0��ʾ�˳�ϵͳ����");
		int input = sc.nextInt();
		return input;
	}
}
