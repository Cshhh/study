package runnian;

import java.util.Scanner;

public class Runnian {
		private int year;
		
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public void panduan(){
			if((year%4==0&&year%100!=0)||year%400==0){
				System.out.println(year+"������");
			}else{
				System.out.println(year+"��ƽ��");
			}
			
		}
		/*public static void main(String[]args){
			System.out.println("������һ�����,�ûس�ȷ��");
			Scanner year=new Scanner(System.in);
			
		}*/
	
		
	
		
}
