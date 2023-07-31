package sec14.exam01;

public class PrintThread extends Thread {
	public void run() {
		
		try {
			while(true) {
				System.out.println("실행");
				Thread.sleep(1);
			}	
		} catch(InterruptedException e) {}
		System.out.println("종료");
		
	}
}
