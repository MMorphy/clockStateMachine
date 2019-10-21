package hr.proging.states;

import hr.proging.clock.ClockTime;

public class BlinkMinutes extends StateBase {

	public BlinkMinutes() {
		super("Blink minutes");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void button1Press() {
		StateBase.currentState = new BlinkSeconds();
	}

	@Override
	public void buttor2Press() {
		ClockTime.incrementMinutes();
	}

	@Override
	public void button12Press() {
		StateBase.currentState = new WorkingClock();
	}

}
