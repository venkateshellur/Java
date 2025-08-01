package com.api.switchexpression;

public class SwitchRecordsRunner {

	sealed interface CustomerMessage permits Message, Feedback {
	}

	final record Message(String text) implements CustomerMessage {
	}

	final record Feedback(int rating, String description) implements CustomerMessage {
	}

	final record SupportRequest(String user, CustomerMessage message) {
	}

	public static void main(String[] args) {
		CustomerMessage customerMessage = new Message("Hello !");

		String response = switch (customerMessage) {
		case Message message -> message.text();
		case Feedback(int rating, String des) -> des;
		// as the interface is sealed and the implementing classes are final the
		// compiler is smart enough to understand the interface or the classes can no
		// more be extended and ignores the default case
		// default -> "Default Message";
		};

		System.out.println(response);

		//
		SupportRequest req = new SupportRequest("Venky", new Feedback(5, "Amazing !!!"));
		String resp = switch (req) {
		case SupportRequest(String user, Message message) -> "User";
		case SupportRequest(String user, Feedback feedback) -> "Feedback.";
		};

		System.out.println(resp);
	}
}
