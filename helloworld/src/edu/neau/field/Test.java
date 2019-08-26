package edu.neau.field;
import my.User4;//导入了User4类
import static java.lang.Math.*; //导入静态属性

public class Test{
	public static void main(String[] args) {
		// my.User4 u5 = new my.User4(102, "高小是");  //写全引用的包名和类名也可以

		User4 u5 = new User4(102,"高小是");
		System.out.println(u5.getName());//打印User4类的属性，要把对应属性设置为public
		System.out.println(Math.PI);
		System.out.println(PI);//引入java.lang.Math里的静态属性后，直接使用PI就可以了
	}

}
