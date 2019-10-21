package hr.proging.clock;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

import hr.proging.states.StateBase;

public class App {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)
				.withZone(ZoneId.systemDefault());
		boolean flag = true;
		Scanner input = new Scanner(System.in);
		String currentInput;
		while (flag) {
			System.out.println("Current state: " + StateBase.currentState.getStateName());
			currentInput = input.nextLine();
			if (currentInput.equalsIgnoreCase("exit")) {
				flag = false;
				input.close();
				return;

			} else if (currentInput.equals("1")) {
				StateBase.currentState.button1Press();
				System.out.println(formatter.format(ClockTime.clock.instant()));
			} else if (currentInput.equals("2")) {
				StateBase.currentState.buttor2Press();
				System.out.println(formatter.format(ClockTime.clock.instant()));
			} else if (currentInput.equals("12")) {
				StateBase.currentState.button12Press();
				System.out.println(formatter.format(ClockTime.clock.instant()));
			} else {
				System.out.println(formatter.format(ClockTime.clock.instant()));
			}
		}
	}
}
