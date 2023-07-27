package sec12.exam01;

import java.text.*;
import java.util.*;

public class DateExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		String strNow1 = now.toString();		
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String Now2 = sdf.format(now);
		System.out.println(Now2);
	}

}
