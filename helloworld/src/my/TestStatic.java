
/*
 * 测试static
 */
package my;

public class TestStatic{
	
	int id;//id
	String name;//姓名
	String pwd;//密码
	static String company = "北京尚学堂！";//公司名称
	public TestStatic(int id , String name) {
		this.id = id;
		this.name=name;
	}
	public void login() {
		System.out.println("登录："+ name);

	}
	public static void printCompany() {
		//login();//静态方法调用非静态成员，编译会出错
		System.out.println(company);
	}
	public static void main(String[] args) {
		TestStatic u =new TestStatic(101,"高小七");
		TestStatic.printCompany();
		TestStatic.company = "北京阿里爷爷！";
		TestStatic.printCompany();
	}

}
