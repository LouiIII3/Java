package sec17.exam01;
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "Java"));
		messageQueue.offer(new Message("sendSMS", "C"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to +" " + "sendMail");
					break;
				case "sendSMS":
					System.out.println(message.to +" " + "sendSMS");
					break;
			}
		}
	}

}
