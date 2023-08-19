package sec18.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;


public class WriteExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("저장 위치/testresult2.db");
		byte[] array = {11,22,33};

		//배열의 모든 바이트 출력
		os.write(array);
        
        // 배열의 1번 인덱스부터 3개 출력
        // os.write(array, 1, 3)
		
		os.flush();
		os.close();
	}
}
