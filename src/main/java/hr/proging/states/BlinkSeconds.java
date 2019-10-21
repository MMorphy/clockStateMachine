package hr.proging.states;

import hr.proging.clock.ClockTime;

public class BlinkSeconds extends StateBase {

	public BlinkSeconds() {
		super("Blink seconds");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void button1Press() {
	}

	@Override
	public void buttor2Press() {
		ClockTime.incrementSeconds();
	}

	@Override
	public void button12Press() {
		StateBase.currentState = new WorkingClock();
	}

}
