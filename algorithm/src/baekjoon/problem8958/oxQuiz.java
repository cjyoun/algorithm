package baekjoon.problem8958;
/*
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;


public class oxQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseCount = sc.nextInt();		// 테스트 케이스 개수 
		
		String [] caseArray = new String[caseCount];
		for(int k=0; k<caseCount; k++) {
			caseArray[k]=sc.next();		// 배열에 테스트 케이스 개수만큼 문자열을 담음 
		}
		
		int count = 0;		// 늘어나는 점수 
		int sum = 0;		//	합계 
		
		for(int i=0; i<caseCount; i++) {
			
			String[] testCase = caseArray[i].split("");	// 테스트 케이스 문자열들을 하나씩 가져와서 단어별로 분리 
			
			// 각 단어 별로 비교해서 계산
			for(int j=0; j<testCase.length; j++) {
				if("X".equals(testCase[j])) {
					count = 0;
				}else {
					count++;
					sum = sum + count;
				}
			}
			System.out.println(sum);
			sum = 0;		// 다음 계산을 위한 합계 초기화 
			count = 0;		// 다음 계산을 위한 점수 초기화
		}
		
		
		
	}

}
