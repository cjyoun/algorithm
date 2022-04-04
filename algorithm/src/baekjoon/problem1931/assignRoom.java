package baekjoon.problem1931;

import java.util.Arrays;
import java.util.Comparator;

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
			array[i][0] = sc.nextInt();	// 첫번째 열 (시작시간)
			array[i][1] = sc.nextInt();	// 두번째 열 (종료시간)
		}

		// https://intrepidgeeks.com/tutorial/bai-jun-1931-meeting-room-arrangement-java-java 참
		// 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의 
		Arrays.sort(array, new Comparator<int[]>() {
		//array이란 변수를 이렇게 정렬하겠다는 문법임
			@Override
			public int compare(int[] o1, int[] o2) {
				
				// 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.  
				if(o1[1] == o2[1]) {// 
					return o1[0] - o2[0];
				}
				// 종료시간을 오름 차순으로 정렬
				return o1[1] - o2[1];
			}

		});
		
		int count = 0;	 // 연속된 회의식 개수 
		int endTime = 0;
		
		for(int i=0; i<conferenceCount; i++) {
			if( array[i][0] >= endTime) {
				endTime = array[i][1];	// 끝나는 시간을 설정 
				count++;
			}
		}	
		
		System.out.println(count);
		
	}
	

}
