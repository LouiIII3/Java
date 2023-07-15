package sec09.exam01;

public class CallListener implements Button.OnclickListener {
	@Override
	public void onClick() {
		System.out.println("전화 거는 중");
	}
}
