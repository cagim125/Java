import java.util.*;

public class FlowEx8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("주민번호를 입력하세요 ex(111111-1111111).>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch(gender) {
		case '1': case '3':
			System.out.println("당신은 남자입니다.");
			break;
		case '2': case '4':
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민번호입니다.");
		
		}
	}

}
