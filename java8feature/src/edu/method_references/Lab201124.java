package edu.method_references;

interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.print(msg);
	}
}

public class Lab201124 {

	public static void main(String[] args) {
		Messageable hello = Message::new;
		hello.getMessage("Hello World....!!");
	}
}
