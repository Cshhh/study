package homework0124;

import java.util.Scanner;

public class Huiwenshu5 {
	public static void main(String[] args){
		int a;
		int b;
		int c;
		int d;
		int e;
//		int number =12345;
		System.out.println("请输入一个正五位数：");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if(number<10000||number>99999){
			System.out.println("输入不是五位数");
		}else if(number>9999&&number<100000){
			a=number/10000;
			b=(number/1000)%10;
			c=(number/100)%10;
			d=(number/10)%10;
			e=number%10;
			if(a==e&&b==d){
				System.out.println("这个是回数");
			}else{
				System.out.println("不是回数");
			}
		}
	}
}
