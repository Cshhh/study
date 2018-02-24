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
				System.out.println(year+"是闰年");
			}else{
				System.out.println(year+"是平年");
			}
			
		}
		/*public static void main(String[]args){
			System.out.println("请输入一个年份,用回车确认");
			Scanner year=new Scanner(System.in);
			
		}*/
	
		
	
		
}
