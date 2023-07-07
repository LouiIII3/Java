package sec04.exam01;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 65;
		
		if(score>=90) {
			System.out.println("A등급 입니다.");
		} else if(score > 75){
			System.out.println("B등급 입니다.");
		} else if(score > 60){
			System.out.println("C등급 입니다.");
		}  else {
			System.out.println("F등급 입니다.");
		}
	}

}
