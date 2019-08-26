package transfer;

public class Transfer
{

	public static void main (String[] args) {
		byte[] b ={00,50 ,56 ,81 ,02};
		int ch = 0x34;
		System.out.println(new String(b) + "\n");
		System.out.printf("%d",ch);
		System.out.println("\n");
		System.out.printf("%c",ch);
	}
	
}
