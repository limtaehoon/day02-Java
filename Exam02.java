package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
    Scanner sc= new Scanner(System.in);
		
    System.out.println("금액을 입력하세요");
	int m1 = sc.nextInt();
	int result = m1/10000;
    System.out.println("만원:"+result);
    m1 = m1%10000;
    result= m1/1000;
    System.out.println("천원:"+ result);
    

	
     
	


		
	}

}
