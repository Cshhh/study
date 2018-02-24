package homework0124;

public class Sanjiao3 {
	public static void main(String[] args){
		for(int a=0;a<5;a++){	
			for(int b=1;b<=a*2-2;b++){
				if(a>b){
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		for(int i=0;i<5;i++){
			for(int m=0;m<5-i;m++){
				System.out.print(" ");
			}
			for(int n=1;n<i;n++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}