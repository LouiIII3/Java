package sec07.exam01;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
	System.out.println("Computer 실행");
		return Math.PI * r * r;
	}
}
