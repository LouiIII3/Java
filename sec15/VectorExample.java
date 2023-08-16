package sec15.exam01;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "언어1", "저자1"));
		list.add(new Board("제목2", "언어2", "저자2"));
		list.add(new Board("제목3", "언어3", "저자3"));
		list.add(new Board("제목4", "언어4", "저자4"));
		
		list.remove(0);
		list.remove(2);
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "," + board.lan + "," + board.writer);
		}
	}

}
