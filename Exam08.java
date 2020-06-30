package day02;

public class Exam08 {

	public static void main(String[] args) {
		//1부터 10까지 홀수의 합 구하기
	int sum=0;
	for(int i=1;i<=10;i++) {
		if(i%2 ==1) {
			sum=++i;
		}
	}
	System.out.println("결과:"+sum);
	System.out.println("=====");
	int hap=0;
	for(int i=1;i<=10; i++) {//1
		if(i%2!=1) continue;//안 맞으면 아래코드를 수행 안하고 다시 올라가라
		hap+=1;
	}
	System.out.println("continue 결과:"+hap);
	System.out.println("=======");
	int h=0;
	for(int i=1;i<=10; i++) {//1
		if(i%2!=1) break;// 안맞으면 아래코드를 수행 안하고 벚어나라
		h +=1;
		System.out.println("break:"+hap);
		System.out.println("=======");
	}
	
	
	
	}
	
	
	
	

}
