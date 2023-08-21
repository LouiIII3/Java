package sec20.exam01;

import java.io.*;


public class PrintStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("저장위치/print.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("프린터에서");
		ps.print("출력하는 것처럼");
		ps.println("보입니다.");
		
		ps.flush();
		ps.close();
	}
}
