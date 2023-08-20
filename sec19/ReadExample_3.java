package sec19.exam01;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader reader = new FileReader("저장위치/test3.txt");
		
		char[] buffer = new char[5];
		
		//입력 스트림으로 부터 3개의 문자를 읽고 buffer[2], buffer[3],buffer[4]에 각각 저장
		int readCharNum = reader.read(buffer, 2, 3);
		if(readCharNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		reader.close();
	}
}
