package homework0124;

import java.util.Scanner;

public class Nishu {
	public static void main(String[] args){
		System.out.println("������һ����λ������");
		Scanner in=new Scanner(System.in);
		int number = in.nextInt();
		if(number>9999){
			System.out.println("��ֵ�������Ӳ�����˼����....");
		}else if(number<1000){
			System.out.println("��ֵ��С���أ����ع���you out");
		}else{
			int a;
			int b;
			int c;
			int d;
			int e;
			a=number/1000;
			b=(number/100)%10;
			c=(number/10)%10;
			d=number%10;
			e=d*1000+c*100+b*10+a;
			System.out.println("������������ǣ�"+e);
		}
	}
}
