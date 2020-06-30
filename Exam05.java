package day02;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		//입력할 갯수를 입력받아
		//그 수만큼 수를 입력받아 그수까지의 합구하기
		//예)5
        //24679
	Scanner sc=new Scanner(System.in);{
	System.out.println("입력할 갯수 입력>>");
	 int cnt =sc.nextInt();
	 System.out.println("데이터 입력>>");
	 int sum =0;
	 for(int i=0 ; i<cnt ; i++) {
	   int inputDate= sc.nextInt();
	   sum += inputDate;
	 }
	 System.out.println("합계"+sum);
	 
	 
	}
}
}