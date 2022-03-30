package baekjoon.problem1712;

import java.util.Scanner;
// 손익분기점 문제
/*
노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며, 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.

예를 들어 A=1,000, B=70이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 열 대 생산하는 데는 총 1,700만원이 든다.

노트북 가격이 C만원으로 책정되었다고 한다. 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(=고정비용+가변비용)보다 많아지게 된다. 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.

A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.

------------
첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다. A, B, C는 21억 이하의 자연수이다.
첫 번째 줄에 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다. 손익분기점이 존재하지 않으면 -1을 출력한다.

 */
public class breakEvenPoint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int staticPrice;		// 고정비용
		int changePrice;		// 가변비용 
		int price;				// 노트북 가격 

		int num = 0;			// 조건 21억이하의 자연수를 위한 수 
		
		int calNum = 0;			// 노트북 가격 - 가변비용 
		int sumPrice = 0;		// calNum * 개수 
		
		staticPrice = sc.nextInt();
		changePrice = sc.nextInt();
		price = sc.nextInt();	
		
		while(true) {
			num++;
			
			calNum = price - changePrice;		// 노트북 - 가변비용 
			sumPrice = calNum * num;			// (노트북 - 가변비용) * 개수 
			
			// 고정비용이 (노트북 - 가변비용) * 개수  보다 작아지면 멈춤 
			if(staticPrice<sumPrice) {
				break;
			}
		
			// 노트북 가격이 가변비용보다 작으면 손익분기점이 없음 
			if(price<changePrice) {
				num = -1;
				break;
			}
			
			// 21억숫자 이후는 멈춤 
			if(num>2100000000) {
				num = -1;
				break;
				
			}

		}
		
		System.out.println(num);
		
		
	}

}
