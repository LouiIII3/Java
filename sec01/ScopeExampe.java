package sec03.exam04;

public class ScopeExampe {

	public static void main(String[] args) {
		int v1 =15;
		if(v1 > 10) {
			int v2;
			v2 = v1 -10;
		}
		int v3 = v1 + v2;
	}

}
