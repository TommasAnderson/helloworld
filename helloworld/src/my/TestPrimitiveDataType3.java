package my;
/*
 * 测试字符类型
 */
public class TestPrimitiveDataType3
{
	public static void main(String[] args) {
		/*char a = 'T';
		char b = '尚';
		char c = '\u0061';
		System.out.println(c);
		
		//转移字符
		System.out.println("" + a + '\n' + b);
		System.out.println("" + 'a' + '\t'+'b');
		*/
		int a = 3;
		int b = a++;//执行完后，b=3。先给b赋值，再自增。
		System.out.println("a=" + a+"\nb="+b);
		a = 3;
		b = ++a;//执行完后，c=5。a先自增，再赋值给c。
		System.out.println("a=" + a+"\nb="+b);
		
		
		
		
	}
	
}
