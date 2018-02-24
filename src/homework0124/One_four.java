package homework0124;

public class One_four {
	public static void main(String[] args){
		int aa[]={1,2,3,4};
		int q=0;
		for(int i=0;i<aa.length;i++){
			int a=aa[i];
			
			for(int j=0;j<aa.length;j++){
				int b=aa[j];
					if(a!=b){
						for(int k=0;k<aa.length;k++){
							int c=aa[k];
							if(a!=c&&b!=c){
								System.out.println(a*100+b*10+c);
								q++;
							}
						}
					}
				}
			}
		System.out.println(q);
		}
	}

