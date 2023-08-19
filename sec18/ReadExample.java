package sec18.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("저장 위치/testresult2.db");
		while(true) {
			//1byte씩 읽기
			int data = is.read();
			
			//파일 끝에 도달했을 경우
			if(data == -1) break;
			System.out.println(data);
		}
		is.close();
	}
}
