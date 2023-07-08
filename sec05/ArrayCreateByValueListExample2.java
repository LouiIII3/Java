package sec05.exam01;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores;
		scores = new int[] { 10,20,100};
		int sum1 = 0;
		for(int i=0; i <3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합은: " + sum1);
	}
}
