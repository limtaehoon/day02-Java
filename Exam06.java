package day02;

import java.util.Scanner;
//1~10 ,11~20,21~30,31~40 .....91~100 �ձ��ϱ�
public class Exam06 {
   public static void main(String[] args) {
	   
	  int num=0;
	   for(int i=1; i<=100 ; i++) {
	        num+=i;
	        if(i%10==0) {
	   System.out.println((i-9)+"����"+i+ "������"+num);
          num=0;   
	        }
	   }
	   
/*�л����� ���ٿ� ���� �л����� �Է¹޾� ����Ͻÿ�
 * 
 *   
 */
    Scanner sc =new Scanner(System.in);
    System.out.println("�л���>>");
    int s= sc.nextInt();
    System.out.println("����>>");
    int l= sc.nextInt();
     
    for(int i=1 ; i<=s;i++) {
    	System.out.print(i+"\t");
    	if(i%l==0) {
    		System.out.println();
    	}
    }
    	//�� �������� ���
    int  row=0; 
    if(s%l==0) {
    	 row = s/l;
    }
    else {
    	row =(s/l)+1;
    	System.out.println();
    	System.out.println("�� ���μ� :"+row);
    }
   //���⿬����(���� ������ )
    int r=
    (s%l==0)? s/l:(s/l)+1;
   System.out.println("�Ѷ��� ��!!:"+r);   
    		
   
   }
   
    
    	 
     
    
   
   
   
   
   
   
   }

