package sec09.exam01;

public class MessageListener implements Button.OnclickListener {
	@Override
	public void onClick() {
		System.out.println("메시지를 보냄");
	}
}
