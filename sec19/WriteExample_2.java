package sec19.exam01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("저장위치/test2.txt");
		
		char[] array = { 'A', 'B', 'C' };
		
		//배열의 모든 문자를 출력합니다.
		writer.write(array);
		
		writer.flush();
		writer.close();
	}
}
