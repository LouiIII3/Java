package sec02.exam;

public class IntegerTypeExample {

	public static void main(String[] args) {
		int var1 = 0b1011;
		int var2 = 0xb3;
		System.out.println("var1 : " + var1 + ", var2 : " + var2);
		
		byte v1 = -128;
		byte v2 = 127;
		System.out.println("v1 : " + v1 + ", v2 : " + v2);
		
		long num1 = 10;
		long num2 =20L;
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		char n1 = 'A';
		char n2 = 65;
		System.out.println("n1 : " + n1 + ", n2 : " + n2);
		
		String a1 ="A";
		String a2 ="전우치";
		System.out.println("a1 : " + a1 + ", a2 : " + a2);
	}

}
