package my;

public class TestOverload{
	
	public static void main(String[] args) {   //测试重载,参数个数不同，类型不同，不同类型位置不同，都构成重载
		
		System.out.println(add(2,4));
		System.out.println(add(2,4,5));
		System.out.println(add(2.5,4));
		System.out.println(add(2,4.5));
	}
	public static int add (int n1,int n2) {
		int sum = n1 + n2;
		return sum;
	}
	public static int add (int n1,int n2,int n3) {
		int sum = n1 + n2 +n3;
		return sum;
	}
	public static double add (double n1,int n2) {
		double sum = n1 + n2;
		return sum;
	}
	public static double add (int n1,double n2) {
		double sum = n1 + n2;
		return sum;
	}

}
