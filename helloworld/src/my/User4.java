package my;

public class User4{
	int id;
    String name;
	String pwd;
	
	public User4(int id,String name) {
		this.id=id;
		this.setName(name);
	}
	
	public void testParameterTransfer1(User4 u) {
		u.setName("高小八");
	}
	
	public void testParameterTransfer2(User4 u) {
		u = new User4(200,"高小九");
	}
	
	public static void main(String[] args) {
		User4 u1 = new User4(100,"高小七");
		
		u1.testParameterTransfer1(u1);
		System.out.println(u1.getName());
		
		u1.testParameterTransfer2(u1);
		System.out.println(u1.getName());
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
