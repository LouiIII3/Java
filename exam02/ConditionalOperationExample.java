package sec03.exam01;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 80;
		char grade = (score > 90) ? 'A' : ((score >80) ? 'b':'c');
		System.out.println(score + "점수는" + grade + "등급입니다.");
	}

}
