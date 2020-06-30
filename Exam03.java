package day02;

import java.util.Scanner;

public class Exam03 {
           Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		for(int i=1 ; i<6;i++) {//i=1,2,3,4,5
				System.out.println(i+":안녕하세요");
			}
			System.out.println("========");
			for (int i=5 ; i>0 ;i--) {
				System.out.println(i+":안녕하세요");
			}
		//2단출력
			for(int i=1;i<10;i++) {
				System.out.println("2"+i+"="+2*i);
			}
			//i는()안에서만 사용함 나오면 의미 없어짐
			/*1부터 10까지 짝수만 출력
			*/
			for(int i=1 ; i<10;i++ ) {
				if(i%2==0) {
			System.out.println("++i");
    } //단을 입력받아 구구단 출력
		 Scanner sc = new Scanner(System.in);
		 System.out.println("단입력");
		 int d = sc.nextInt();
		 //단출력
		 for(int i1=1;i1<10;i1++) {
			 System.out.println(d+"*"+i1+"="+d*+i1);
		 }
	 }
			
			
	}
}
