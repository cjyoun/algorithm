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
			array[i][0] = sc.nextInt();	// 첫번째 열 (시작시간)
			array[i][1] = sc.nextInt();	// 두번째 열 (종료시간)
		}

		quickSort(array, 0, conferenceCount -1, 0); // 퀵정렬로 첫번째 열 정렬 

		quickSort(array, 0, conferenceCount -1, 1); // 퀵정렬로 번째 열 정렬 
        
		
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
	
	
	public static void quickSort(int[][] array, int start, int end, int index){
        
        if(start>=end) //원소가 1개인 경우 종료
        return;
        
        int pivot = start; //피벗은 첫 번째 원소
        int left = start+1;
        int right = end;
        
        if(index==0) {
        	while ( left <= right){
                
                //피벗보다 큰 데이터를 찾을 때까지 반복
                while (left <= end && array[left][0] <= array[pivot][0])
                    left+=1;
                
                //피벗보다 작은 데이터를 찾을 때까지 반복
                while(right > start && array[right][0] >= array[pivot][0])
                    right-=1;
                
                if(left > right){ // 엇갈렸다면 작은 데이터와 피벗을 교체
                    int[] tmp = array[right];
                    array[right] = array[pivot];
                    array[pivot] = tmp;
                }else{ //엇갈리지 않았다면 적은 데이터와 큰 데이터를 교체
                    int[] tmp = array[right];
                    array[right] = array[left];
                    array[left] = tmp;
                }
                
                //분할  이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
                quickSort(array, start, right -1, 0);
                quickSort(array, right +1, end, 0);
            }
        }else {
        	while ( left <= right){
                
                //피벗보다 큰 데이터를 찾을 때까지 반복
                while (left <= end && array[left][1] <= array[pivot][1])
                    left+=1;
                
                //피벗보다 작은 데이터를 찾을 때까지 반복
                while(right > start && array[right][1] >= array[pivot][1])
                    right-=1;
                
                if(left > right){ // 엇갈렸다면 작은 데이터와 피벗을 교체
                    int[] tmp = array[right];
                    array[right] = array[pivot];
                    array[pivot] = tmp;
                }else{ //엇갈리지 않았다면 적은 데이터와 큰 데이터를 교체
                    int[] tmp = array[right];
                    array[right] = array[left];
                    array[left] = tmp;
                }
                
                //분할  이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
                quickSort(array, start, right -1, 1);
                quickSort(array, right +1, end, 1);
            }
        }
        
    }

}
