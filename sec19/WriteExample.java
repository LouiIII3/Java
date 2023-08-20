package sec19.exam01;

import java.io.FileWriter;
import java.io.Writer;


public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("저장위치/test.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
	}
}
