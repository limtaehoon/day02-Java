package day02;

import java.util.Scanner;
//1~10 ,11~20,21~30,31~40 .....91~100 합구하기
public class Exam06 {
   public static void main(String[] args) {
	   
	  int num=0;
	   for(int i=1; i<=100 ; i++) {
	        num+=i;
	        if(i%10==0) {
	   System.out.println((i-9)+"부터"+i+ "까지합"+num);
          num=0;   
	        }
	   }
	   
/*학생수와 한줄에 앉을 학생수를 입력받아 출력하시오
 * 
 *   
 */
    Scanner sc =new Scanner(System.in);
    System.out.println("학생수>>");
    int s= sc.nextInt();
    System.out.println("한줄>>");
    int l= sc.nextInt();
     
    for(int i=1 ; i<=s;i++) {
    	System.out.print(i+"\t");
    	if(i%l==0) {
    		System.out.println();
    	}
    }
    	//총 몇줄인지 출력
    int  row=0; 
    if(s%l==0) {
    	 row = s/l;
    }
    else {
    	row =(s/l)+1;
    	System.out.println();
    	System.out.println("총 라인수 :"+row);
    }
   //삼향연산자(조건 연산자 )
    int r=
    (s%l==0)? s/l:(s/l)+1;
   System.out.println("총라인 수!!:"+r);   
    		
   
   }
   
    
    	 
     
    
   
   
   
   
   
   
   }

