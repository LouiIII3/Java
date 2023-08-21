package sec20.exam01;

import java.io.*;


public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("저장위치/test.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("아이언맨");
		dos.writeUTF("A+");
		dos.writeInt(1);
		
		dos.writeUTF("토르");
		dos.writeUTF("A+");
		dos.writeInt(2);
		
		dos.flush(); dos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("저장위치/test.db");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			String score = dis.readUTF();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close(); fis.close();
	}
}
