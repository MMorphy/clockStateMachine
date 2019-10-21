package hr.proging.states;

import hr.proging.clock.ClockTime;

public class BlinkHours extends StateBase {

	public BlinkHours() {
		super("Blink hours");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void button1Press() {
		StateBase.currentState = new BlinkMinutes();
	}

	@Override
	public void buttor2Press() {
		ClockTime.incrementHours();
	}

	@Override
	public void button12Press() {
		StateBase.currentState = new WorkingClock();
	}

}
