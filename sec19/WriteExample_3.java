package sec19.exam01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("저장위치/test3.txt");
		
		char[] array = { 'H', 'E', 'L', 'L', 'O' };
		
		writer.write(array, 1, 3);
		
		writer.flush();
		writer.close();
	}
}
