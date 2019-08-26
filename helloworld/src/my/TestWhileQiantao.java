package my;

public class TestWhileQiantao
{
	public static void main (String[] args) {//打印99乘法表
		for(int n=1;n<=9;n++) {
			for(int m=1;m<=n;m++) {
			System.out.print(m+"*"+n+"="+(m*n)+"\t");
			}
		System.out.println();
		}
		int h=0;
		for(int i=1;i<=1000;i++) {
			if(i%5==0) {
			System.out.print(i+"\t");
			h++;
			}
			if(h==5) {
				System.out.println();
				h=0;
			}
		}
		
	}
	
	

}
