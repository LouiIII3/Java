package sec05.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "전우치";
		String strVar2 = "전우치";
		
		if(strVar1 == strVar2) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		
		
		String strVar3 = new String("전우치");
		String strVar4 = new String("전우치");
		
		if(strVar3 == strVar4) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
	}

}
