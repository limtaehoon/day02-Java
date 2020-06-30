package day02;

import java.util.Scanner;

public class Exam09 {
//수를 입력하는데 마지막은-1
	//입력한수와 합계와 평균을 구하시오
	//예)10 5 6 9 -1
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("수를 입력하세요.마지막은 -1");
        int sum=0;
        int cnt=0;
        while(true) {//무한루프   무한이기에 조건문 while로 쓰는게 편하다.
        int su= sc.nextInt();	
        	if(su==-1)break;
        sum +=su;
        cnt++;
        }
        System.out.println("합계:"+sum);
        System.out.println("평균:"+sum/cnt);	
			sc.close();				
				
	}

	}

