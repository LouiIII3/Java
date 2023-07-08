package sec05.exam01;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] javaScores = { {95,80},{15,20},{35,40}};
		for(int i=0; i < javaScores.length; i++) {
			for(int j=0; j<javaScores[i].length; j++) {
				System.out.println("javaScores["+i+"]["+j+"]="+javaScores[i][j]);
			}
		}
	}

}
