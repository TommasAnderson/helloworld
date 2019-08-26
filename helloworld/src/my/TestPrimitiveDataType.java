package my;
import java.math.*;
/*
 * @author derek
 * 测试基本数据类型
 */
public class TestPrimitiveDataType
{	public static void main(String[] args) {
	int a = 15;
	int b = 015;
	int c = 0x15;
	int d = 0b01110011;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
	int population = 2000000000;
	long globalPopulation = 7400000000L;
	//要使用精确的浮点运算，使用BigDecimal
	BigDecimal bd = BigDecimal.valueOf(1.0);
	bd = bd.subtract(BigDecimal.valueOf(0.1));
	bd = bd.subtract(BigDecimal.valueOf(0.1));
	bd = bd.subtract(BigDecimal.valueOf(0.1));
	bd = bd.subtract(BigDecimal.valueOf(0.1));
	bd = bd.subtract(BigDecimal.valueOf(0.1));
	System.out.println(bd);
	System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
	
	
	BigDecimal bd2 = BigDecimal.valueOf(1.0);
	BigDecimal bd3 = BigDecimal.valueOf(1.0/10.0);
	
	System.out.println(bd2.equals(bd3));
}	

}
