package sec07.exam01;

public class ChildExample2 {
	public static void main(String[] args) {
		Parent2 parent = new Child2();
		parent.field1 = "data1"; //자동 타입 변환
		parent.method1();
		parent.method2();
		
		Child2 child = (Child2) parent; //강제 타입 변환
		child.field2 = "yyy";
		child.method3();
		}

}
