package hr.proging.states;

public abstract class StateBase {

	private String stateName;

	public static StateBase currentState = new WorkingClock();
	
	public StateBase(String stateName) {
		super();
		this.stateName = stateName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public abstract void button1Press();

	public abstract void buttor2Press();

	public abstract void button12Press();
}
