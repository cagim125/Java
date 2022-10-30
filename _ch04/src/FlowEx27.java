import java.util.*;

public class FlowEx27 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		int num = 0;
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력하세요");

		while(flag) {
			System.out.println(">>");
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {
				 sum += num;
			} else {
				flag = false;
			}
		}
		System.out.println("랍계:"+sum);
	}

}
