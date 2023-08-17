package sec16.exam01;
import java.util.*;


public class HashtableExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<>();

		map.put("Java", "1111");
		map.put("C", "2222");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디,비번 입력");
			System.out.print("id: ");
			String id = scanner.nextLine();
			
			System.out.print("pw: ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("login");
					break;
				} else {
					System.out.println("no pw");
				}				
			} else {
				System.out.println("no id");
			}
		}
	}
}
