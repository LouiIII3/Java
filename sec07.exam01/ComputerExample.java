package sec07.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;		
		Calculator calculator = new Calculator();
		System.out.println(calculator.areaCircle(r));		
		System.out.println();		
		Computer computer = new Computer();
		System.out.println(computer.areaCircle(r));
	}

}
