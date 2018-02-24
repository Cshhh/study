package homework0124;

import java.util.Scanner;

public class Nishu {
	public static void main(String[] args){
		System.out.println("请输入一个四位正整数");
		Scanner in=new Scanner(System.in);
		int number = in.nextInt();
		if(number>9999){
			System.out.println("数值过大，脑子不够，思考中....");
		}else if(number<1000){
			System.out.println("数值过小了呢，不守规则，you out");
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
			System.out.println("这个数的逆数是："+e);
		}
	}
}
