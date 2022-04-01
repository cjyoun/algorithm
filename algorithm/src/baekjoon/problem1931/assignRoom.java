package baekjoon.problem1931;

import java.util.Arrays;

/*
한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다. 
각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자. 
단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다. 
회의의 시작시간과 끝나는 시간이 같을 수도 있다. 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.

첫째 줄에 최대 사용할 수 있는 회의의 최대 개수를 출력한다.

 */

import java.util.Scanner;

public class assignRoom {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int conferenceCount = sc.nextInt();
		
		int [][] array = new int[conferenceCount][2];
		
		for(int i=0; i<conferenceCount; i++) {
			array[i][0] = sc.nextInt();
			array[i][1] = sc.nextInt();
		}
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//	
//		int conferenceCount = sc.nextInt();
//		
//		int [][] array = new int[conferenceCount][2];
//		
//		for(int i=0; i<conferenceCount; i++) {
//			array[i][0] = sc.nextInt();
//			array[i][1] = sc.nextInt();
//		}
//		
//		int count = 0;
//		int count2 = 0;
//		int maxCount = 0;
//		
//		System.out.println(Arrays.deepToString(array) + " / " + array[0][0]);
//
//		for(int i=0; i<conferenceCount; i++) {
//			int k=i;
//			for(int j=0; j<conferenceCount; j++) {
//				if(i==j) {
//					continue;
//				}
//				if( (array[k][0]<array[j][0]) && (array[k][1]<=array[j][0])) {
//					count++;
//					k=j;
//				}
//			}
//			count2 = count;
//			if(count2> maxCount) {
//				maxCount = count2;
//			}
//			count = 0;
//		}
//		
//		
//		System.out.println(maxCount+1);
//		
		
		
	}
}
