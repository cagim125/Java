import java.util.*;

public class FlowEx30 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			System.out.printf("i=%d ",i);
			
			int tmp = i;
			
			do {
				//tmp%10이 3의 배수인지 확인(0 제외)
				if(tmp%10%3==0 && tmp%10!=0) {
					System.out.println("짝");
				}
			}while((tmp/=10)!=0);
			System.out.println();
		}
	}

}
