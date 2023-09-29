package secfin.exam01;


import java.io.*;

public class GetLineStringFromKeyboard {
	public static void main(String[] args)  throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);

		while(true) {
			System.out.print("입력하기: ");
			String lineStr = br.readLine();
			if(lineStr.equals("end")) break;
			System.out.print("입력된 내용: " + lineStr);
			System.out.println();
		}
		br.close();
	}
}
