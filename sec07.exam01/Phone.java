package sec07.exam01;

public class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰을 켭니다.");
	}	
	public void turnOff() {
		System.out.println("폰을 끕니다.");
	}
}
