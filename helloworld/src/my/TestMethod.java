package my;

public class TestMethod{

	public static void main (String[] args) {
		//通过对象调用普通方法
		TestMethod tm = new TestMethod();
		tm.printSxt();
		tm.add(30, 40, 50);
		int h = tm.add(30, 40, 50) + 1000;
		System.out.println(h);
	}
	void printSxt() {
		System.out.println("我是输出1");
		System.out.println("我是输出2");
		System.out.println("我是输出3");
	}
	int add(int a,int b,int c) {
		int sum = a+b+c;
		System.out.println(sum);
		return sum;  //return 两个作用：1、结束方法运行。2、返回值
	}
	
	
	
}
