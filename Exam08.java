package day02;

public class Exam08 {

	public static void main(String[] args) {
		//1���� 10���� Ȧ���� �� ���ϱ�
	int sum=0;
	for(int i=1;i<=10;i++) {
		if(i%2 ==1) {
			sum=++i;
		}
	}
	System.out.println("���:"+sum);
	System.out.println("=====");
	int hap=0;
	for(int i=1;i<=10; i++) {//1
		if(i%2!=1) continue;//�� ������ �Ʒ��ڵ带 ���� ���ϰ� �ٽ� �ö󰡶�
		hap+=1;
	}
	System.out.println("continue ���:"+hap);
	System.out.println("=======");
	int h=0;
	for(int i=1;i<=10; i++) {//1
		if(i%2!=1) break;// �ȸ����� �Ʒ��ڵ带 ���� ���ϰ� �����
		h +=1;
		System.out.println("break:"+hap);
		System.out.println("=======");
	}
	
	
	
	}
	
	
	
	

}
