package sec17.exam01;
import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> Box = new Stack<Coin>();
		
		Box.push(new Coin(1000));
		Box.push(new Coin(500));
		Box.push(new Coin(100));
		Box.push(new Coin(50));
		
		while(!Box.isEmpty()) {
			Coin coin = Box.pop();
			System.out.println("꺼낸 동전: " + coin.getValue());
		}
	}
}
