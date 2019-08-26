package my;

public class SxtStu{
	//属性field
	int id;
	String name;
	int age;
	
	Computer comp;//计算机
	
	//方法
	void study(){
		System.out.println("我在认证学习！！" + comp.brand);
	}
	void play() {
		System.out.println("我在玩游戏！吃鸡！");
	}
	
	
	//程序执行的入口，必须要有
	public static void main(String[] args) {
		SxtStu stu = new SxtStu();//创建一个对象
		stu.id = 1001;
		stu.age = 18;
		stu.name = "derek";
		
		Computer c1 = new Computer();
		c1.brand = "lenovo";
		
		stu.comp = c1;
		
		stu.play();	
		stu.study();
	}

}

class Computer{
	String brand;
}
