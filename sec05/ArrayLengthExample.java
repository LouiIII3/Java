package sec05.exam01;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = { 83, 90 ,97 };
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합은: " + sum);
	}

}
