package hr.proging.states;

public class WorkingClock extends StateBase {

	public WorkingClock() {
		super("Working Clock");
	}

	@Override
	public void button1Press() {
	}

	@Override
	public void buttor2Press() {
	}

	@Override
	public void button12Press() {
		StateBase.currentState = new BlinkHours();
	}

}
